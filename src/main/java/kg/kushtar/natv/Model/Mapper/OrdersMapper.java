package kg.kushtar.natv.Model.Mapper;

import kg.kushtar.natv.Model.Dto.OrdersDto;
import kg.kushtar.natv.Model.Orders;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders, OrdersDto>{
    OrdersMapper INSTANCE = Mappers.getMapper(OrdersMapper.class);
}
