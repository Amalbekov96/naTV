package kg.kushtar.natv.Controller.Web;

import kg.kushtar.natv.Model.Dto.MenuDto;
import kg.kushtar.natv.Model.Mapper.ChannelsMapper;
import kg.kushtar.natv.Service.ChannelsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/v1/menu")
public class GetController {

    @Autowired
    private ChannelsServiceImpl channelsService;

    @Autowired
    private ChannelsMapper channelsMapper;


    @GetMapping("/getAll")
    public @ResponseBody
    List<MenuDto> getAll(){
        return channelsService.findAllChannels();
    }
}
