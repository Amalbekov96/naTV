package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Repository.ChannelsRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ChannelsServiceImpl extends BaseServiceImpl<Channels,ChannelsRepo> {
    protected ChannelsServiceImpl(ChannelsRepo repo) {
        super(repo);
    }
}
