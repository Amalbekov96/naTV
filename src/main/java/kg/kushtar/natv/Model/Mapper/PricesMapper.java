package kg.kushtar.natv.Model.Mapper;

import kg.kushtar.natv.Model.Dto.PricesDto;
import kg.kushtar.natv.Model.Prices;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PricesMapper extends BaseMapper<Prices, PricesDto>{
    PricesMapper INSTANCE = Mappers.getMapper(PricesMapper.class);
}
