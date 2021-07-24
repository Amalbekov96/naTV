package kg.kushtar.natv.Model.Mapper.Impl;

import kg.kushtar.natv.Model.Discounts;
import kg.kushtar.natv.Model.Dto.DiscountsDto;
import kg.kushtar.natv.Model.Mapper.DiscountsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountMapperImpl implements DiscountsMapper {
    @Override
    public Discounts toEntity(DiscountsDto discountsDto) {
        return DiscountsMapper.INSTANCE.toEntity(discountsDto);
    }

    @Override
    public DiscountsDto toDto(Discounts discounts) {
        return DiscountsMapper.INSTANCE.toDto(discounts);
    }

    @Override
    public List<Discounts> toListEntity(List<DiscountsDto> d) {
        return DiscountsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<DiscountsDto> toListDto(List<Discounts> e) {
        return DiscountsMapper.INSTANCE.toListDto(e);
    }
}
