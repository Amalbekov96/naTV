package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Dto.PricesDto;
import kg.kushtar.natv.Model.Mapper.PricesMapper;
import kg.kushtar.natv.Model.Prices;
import kg.kushtar.natv.Repository.PricesRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PricesServiceImpl extends BaseServiceImpl<Prices, PricesDto, PricesMapper, PricesRepo> {

    private PricesRepo pricesRepo;
    private PricesMapper pricesMapper;

    public PricesServiceImpl(PricesRepo repo, PricesMapper mapper, PricesRepo pricesRepo, PricesMapper pricesMapper) {
        super(repo, mapper);
        this.pricesRepo = pricesRepo;
        this.pricesMapper = pricesMapper;
    }

    public PricesDto findByChannelIdAndDate(Long id){
        return pricesMapper.toDto(pricesRepo.findPricesByChannelId(id));
    }
}
