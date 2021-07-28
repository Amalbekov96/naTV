package kg.kushtar.natv.Controller.Web;

import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Days;
import kg.kushtar.natv.Model.Dto.PostDto;
import kg.kushtar.natv.Model.Enum.Orderstatus;
import kg.kushtar.natv.Model.OrderDetails;
import kg.kushtar.natv.Model.Orders;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/api/v1/post")
public class PostController {

    @PostMapping("/createOrder")
    public String createOrder(@RequestBody PostDto postDto){

        LocalDateTime now = LocalDateTime.now();
        Orders order = new Orders();
        List<Days> days = new ArrayList<>();
        OrderDetails orderDetail = new OrderDetails();
        List<Channels> channels = postDto.getChannels();


        order.setAddDate(now);
        order.setEditDate(now);
        order.setName(postDto.getClientName());
        order.setText(postDto.getText());
        order.setEmail(postDto.getEmail());
        order.setPhone(postDto.getPhone());
        order.setTotalPrice(postDto.getTotal_price());
        order.setStatus(Orderstatus.NEW);
        order.setAddDate(now);
        order.setEditDate(now);



        return "";
    }
}
