package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.Channels;
import lombok.Data;

import java.util.List;

@Data
public class PostDto {
    private String text;
    private String clientName;
    private String phone;
    private String email;
    private double total_price;
    List<PostChannelsDto> channels;
}
