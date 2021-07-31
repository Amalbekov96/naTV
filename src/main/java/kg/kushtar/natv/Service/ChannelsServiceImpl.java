package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Dto.ChannelsDto;
import kg.kushtar.natv.Model.Mapper.ChannelsMapper;
import kg.kushtar.natv.Repository.ChannelsRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ChannelsServiceImpl extends BaseServiceImpl<Channels, ChannelsDto, ChannelsMapper,ChannelsRepo> {
    public ChannelsServiceImpl(ChannelsRepo repo, ChannelsMapper mapper) {
        super(repo, mapper);
    }
}
