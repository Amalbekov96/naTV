package kg.kushtar.natv.Model.Mapper;

import kg.kushtar.natv.Model.Dto.OrderDetailsDto;
import kg.kushtar.natv.Model.OrderDetails;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface OrderDetailsMapper extends BaseMapper<OrderDetails, OrderDetailsDto>{
    OrderDetailsMapper INSTANCE = Mappers.getMapper(OrderDetailsMapper.class);
}
