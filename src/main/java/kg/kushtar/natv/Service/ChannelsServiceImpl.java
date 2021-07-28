package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Dto.MenuDto;
import kg.kushtar.natv.Repository.ChannelsRepo;
import kg.kushtar.natv.Repository.DiscountsRepo;
import kg.kushtar.natv.Repository.PricesRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChannelsServiceImpl extends BaseServiceImpl<Channels,ChannelsRepo> {

    private ChannelsRepo channelsRepo;
    private PricesRepo pricesRepo;
    private DiscountsRepo discountsRepo;

    public ChannelsServiceImpl(ChannelsRepo repo, ChannelsRepo channelsRepo, PricesRepo pricesRepo, DiscountsRepo discountsRepo) {
        super(repo);
        this.channelsRepo = channelsRepo;
        this.pricesRepo = pricesRepo;
        this.discountsRepo = discountsRepo;
    }

    public List<MenuDto> findAllChannels(){

        List<MenuDto> menuDto = new ArrayList<>();

        List<Channels> channels = channelsRepo.findAll();

        for(int i = 0; i < channels.size(); i++){
            MenuDto menuDtoTemp = new MenuDto();
            Channels channelsTemp = channels.get(i);
            menuDtoTemp.setId(channelsTemp.getId());
            menuDtoTemp.setName(channelsTemp.getName());
            menuDtoTemp.setImage(channelsTemp.getImage());
            menuDtoTemp.setPrice(pricesRepo.findByChannel(channelsTemp));
            menuDtoTemp.setDiscounts(discountsRepo.findAllByChannel(channelsTemp));
            menuDto.add(menuDtoTemp);
        }
        return menuDto;
    }
}
