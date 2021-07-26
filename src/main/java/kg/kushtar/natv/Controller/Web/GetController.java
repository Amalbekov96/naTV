package kg.kushtar.natv.Controller.Web;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Dto.ChannelsDto;
import kg.kushtar.natv.Model.Dto.MenuDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/v1/menu")
public class GetController {

    @GetMapping("/getAll")
    public @ResponseBody
    ChannelsDto getAll(){


        return null;
    }
}
