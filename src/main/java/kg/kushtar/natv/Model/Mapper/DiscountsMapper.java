package kg.kushtar.natv.Model.Mapper;

import kg.kushtar.natv.Model.Discounts;
import kg.kushtar.natv.Model.Dto.DiscountsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DiscountsMapper extends BaseMapper<Discounts, DiscountsDto> {
    DiscountsMapper INSTANCE = Mappers.getMapper(DiscountsMapper.class);
}
