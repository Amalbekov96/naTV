package kg.kushtar.natv.Controller.Web;

import kg.kushtar.natv.Model.Dto.ChannelsDto;
import kg.kushtar.natv.Model.Dto.DiscountsDto;
import kg.kushtar.natv.Model.Dto.MenuDto;
import kg.kushtar.natv.Model.Dto.PricesDto;
import kg.kushtar.natv.Model.Mapper.ChannelsMapper;
import kg.kushtar.natv.Model.Prices;
import kg.kushtar.natv.Service.ChannelsServiceImpl;
import kg.kushtar.natv.Service.DiscountsServiceImpl;
import kg.kushtar.natv.Service.PricesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1/menu")
public class GetController {

    private ChannelsServiceImpl channelsService;
    private ChannelsMapper channelsMapper;
    private PricesServiceImpl pricesService;
    private DiscountsServiceImpl discountsService;

    public GetController(ChannelsServiceImpl channelsService, ChannelsMapper channelsMapper, PricesServiceImpl pricesService, DiscountsServiceImpl discountsService) {
        this.channelsService = channelsService;
        this.channelsMapper = channelsMapper;
        this.pricesService = pricesService;
        this.discountsService = discountsService;
    }

    @GetMapping("/getmenu")
    public @ResponseBody List<MenuDto>  getMenu(){

        List<ChannelsDto> channels = channelsService.findAll();
        List<MenuDto> menuList = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();

        for(ChannelsDto ch : channels){
            PricesDto price = pricesService.findByChannelIdAndDate(ch.getId());
            List<DiscountsDto> discounts = discountsService.findByChannelIdAndDate(ch.getId());
            MenuDto menuDto = new MenuDto();
            menuDto.setId(ch.getId());
            menuDto.setImage(ch.getImage());
            menuDto.setName(ch.getName());
            menuDto.setPrice(price);
            menuDto.setDiscounts(discounts);
            menuList.add(menuDto);
        }
        return menuList;
    }

}

