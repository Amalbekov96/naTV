package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Discounts;
import kg.kushtar.natv.Model.Dto.DiscountsDto;
import kg.kushtar.natv.Model.Mapper.DiscountsMapper;
import kg.kushtar.natv.Repository.DiscountsRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class DiscountsServiceImpl extends BaseServiceImpl<Discounts, DiscountsDto, DiscountsMapper,DiscountsRepo> {
    public DiscountsServiceImpl(DiscountsRepo repo, DiscountsMapper mapper) {
        super(repo, mapper);
    }

    @Autowired
    private DiscountsMapper discountsMapper;
    @Autowired
    private DiscountsRepo discountsRepo;

    public List<DiscountsDto> findByChannelIdAndDate(Long id){
        return discountsMapper.toListDto(discountsRepo.findAllByChannelId(id));
    }
}
