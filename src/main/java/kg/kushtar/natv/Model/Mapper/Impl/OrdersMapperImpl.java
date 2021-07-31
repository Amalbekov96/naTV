package kg.kushtar.natv.Model.Mapper.Impl;

import kg.kushtar.natv.Model.Dto.OrdersDto;
import kg.kushtar.natv.Model.Mapper.OrdersMapper;
import kg.kushtar.natv.Model.Orders;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersMapperImpl implements OrdersMapper {
    @Override
    public Orders toEntity(OrdersDto ordersDto) {
        return OrdersMapper.INSTANCE.toEntity(ordersDto);
    }

    @Override
    public OrdersDto toDto(Orders orders) {
        return OrdersMapper.INSTANCE.toDto(orders);
    }

    @Override
    public List<Orders> toListEntity(List<OrdersDto> d) {
        return OrdersMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<OrdersDto> toListDto(List<Orders> e) {
        return OrdersMapper.INSTANCE.toListDto(e);
    }

}
