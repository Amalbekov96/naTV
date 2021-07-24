package kg.kushtar.natv.Controller.Common;

import kg.kushtar.natv.Controller.Base.BaseController;
import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Service.ChannelsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/channels")
public class ChannelController extends BaseController<Channels, ChannelsServiceImpl> {
    protected ChannelController(ChannelsServiceImpl service) {
        super(service);
    }
}
