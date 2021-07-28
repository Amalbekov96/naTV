package kg.kushtar.natv.Model.Mapper.Impl;

import kg.kushtar.natv.Model.Dto.OrderDetailsDto;
import kg.kushtar.natv.Model.Mapper.OrderDetailsMapper;
import kg.kushtar.natv.Model.OrderDetails;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderDetailsMapperImpl implements OrderDetailsMapper {
    @Override
    public OrderDetails toEntity(OrderDetailsDto orderDetailsDto) {
        return OrderDetailsMapper.INSTANCE.toEntity(orderDetailsDto);
    }

    @Override
    public OrderDetailsDto toDto(OrderDetails orderDetails) {
        return OrderDetailsMapper.INSTANCE.toDto(orderDetails);
    }

    @Override
    public List<OrderDetails> toListEntity(List<OrderDetailsDto> d) {
        return OrderDetailsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<OrderDetailsDto> toListDto(List<OrderDetails> e) {
        return OrderDetailsMapper.INSTANCE.toListDto(e);
    }

}
