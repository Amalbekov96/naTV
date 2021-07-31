package kg.kushtar.natv.Model.Mapper.Impl;

import kg.kushtar.natv.Model.Dto.PricesDto;
import kg.kushtar.natv.Model.Mapper.PricesMapper;
import kg.kushtar.natv.Model.Prices;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PricesMapperImpl implements PricesMapper {
    @Override
    public Prices toEntity(PricesDto pricesDto) {
        return PricesMapper.INSTANCE.toEntity(pricesDto);
    }

    @Override
    public PricesDto toDto(Prices prices) {
        return PricesMapper.INSTANCE.toDto(prices);
    }

    @Override
    public List<Prices> toListEntity(List<PricesDto> d) {
        return PricesMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<PricesDto> toListDto(List<Prices> e) {
        return PricesMapper.INSTANCE.toListDto(e);
    }

}
