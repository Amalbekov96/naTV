package kg.kushtar.natv.Controller.Web;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Days;
import kg.kushtar.natv.Model.Dto.*;
import kg.kushtar.natv.Model.Enum.Orderstatus;
import kg.kushtar.natv.Model.OrderDetails;
import kg.kushtar.natv.Model.Orders;
import kg.kushtar.natv.Service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1/post")
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping("/createOrder")
    @ResponseBody
    public PostDto createOrder(@RequestBody PostDto postDto){
        return postService.save(postDto);
    }
}
