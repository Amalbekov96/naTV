package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Dto.*;
import kg.kushtar.natv.Model.Enum.Orderstatus;
import kg.kushtar.natv.Model.Mapper.BaseMapper;
import kg.kushtar.natv.Model.Mapper.DaysMapper;
import kg.kushtar.natv.Model.Mapper.OrdersMapper;
import kg.kushtar.natv.Model.OrderDetails;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {


    private DiscountsServiceImpl discountsService;
    private OrdersServiceImpl ordersService;
    private OrdersMapper ordersMapper;
    private ChannelsServiceImpl channelsService;
    private OrderDetailsServiceImpl orderDetailsService;
    private BaseMapper<OrderDetails, OrderDetailsDto> orderDetailMapper;
    private DaysServiceImpl daysService;
    private DaysMapper daysMapper;
    private PricesServiceImpl pricesService;


    public PostService(DiscountsServiceImpl discountsService, OrdersServiceImpl ordersService, OrdersMapper ordersMapper, ChannelsServiceImpl channelsService, OrderDetailsServiceImpl orderDetailsService, BaseMapper<OrderDetails, OrderDetailsDto> orderDetailMapper, DaysServiceImpl daysService, DaysMapper daysMapper, PricesServiceImpl pricesService) {
        this.discountsService = discountsService;
        this.ordersService = ordersService;
        this.ordersMapper = ordersMapper;
        this.channelsService = channelsService;
        this.orderDetailsService = orderDetailsService;
        this.orderDetailMapper = orderDetailMapper;
        this.daysService = daysService;
        this.daysMapper = daysMapper;
        this.pricesService = pricesService;
    }

    public PostDto save(PostDto postDto) {

        String textOr = postDto.getText();
        String text = textOr.replaceAll("\\s+","");
        List<PostChannelsDto> channelsDto = postDto.getChannels();

        double totalPrice = 0.0;

        List<Long> channelIds = new ArrayList<>();
        List<Double> channelPrice = new ArrayList<>();

        for(PostChannelsDto ch : channelsDto){
            List<LocalDate> days = ch.getDays();
            List<DiscountsDto> discounts = discountsService.findByChannelIdAndDate(ch.getId());

            channelIds.add(ch.getId());

            double percent = 1.0;
            for(DiscountsDto d : discounts){
                if(d.getMinDays() <= days.size()){
                    percent = d.getPercent();
                    break;
                }
            }

            double chPrice = pricesService.findByChannelIdAndDate(ch.getId()).getPrice();
            ch.setPrice(chPrice);

            if(percent != 1.0){
                channelPrice.add((text.length() * chPrice) - (text.length() * chPrice * percent / 100));
                totalPrice += (text.length() * chPrice) - (text.length() * chPrice * percent / 100);
            } else {
                channelPrice.add((text.length() * chPrice));
                totalPrice += (text.length() * chPrice);
            }

        }

        OrdersDto orders = new OrdersDto();

        LocalDateTime now = LocalDateTime.now();

        orders.setText(textOr);
        orders.setName(postDto.getClientName());
        orders.setPhone(postDto.getPhone());
        orders.setEmail(postDto.getEmail());
        orders.setTotalPrice(totalPrice);
        orders.setAddDate(now);
        orders.setEditDate(now);
        orders.setStatus(Orderstatus.NEW);

        orders = ordersService.create(ordersMapper.toEntity(orders));

        List<Long> OrderDetailsSavedIds = new ArrayList<>();

        for(int i = 0; i < channelIds.size(); i++){
            OrderDetailsDto orderDetailsDto = new OrderDetailsDto();
            ChannelsDto channel = channelsService.findById(channelIds.get(i));
            orderDetailsDto.setOrder(orders);
            orderDetailsDto.setChannel(channel);
            orderDetailsDto.setPrice(channelPrice.get(i));
            OrderDetailsSavedIds.add(orderDetailsService.create(orderDetailMapper.toEntity(orderDetailsDto)).getId());
        }


        for(int i = 0; i < channelsDto.size(); i++) {
            List<LocalDate> days = channelsDto.get(i).getDays();
            for(LocalDate day : days){
                DaysDto dayDto = new DaysDto();
                dayDto.setDay(day);
                dayDto.setOrderDetails(orderDetailsService.findById(OrderDetailsSavedIds.get(i)));
                daysService.create(daysMapper.toEntity(dayDto));
            }
        }

        postDto.setTotal_price(totalPrice);
        return postDto;
    }
}
