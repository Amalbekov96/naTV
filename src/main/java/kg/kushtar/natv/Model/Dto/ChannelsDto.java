package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.OrderDetails;
import lombok.Data;

import java.util.List;

@Data
public class ChannelsDto {
    private Long id;
    private String image;
    private Boolean active;
    List<OrderDetails> orders;
}
