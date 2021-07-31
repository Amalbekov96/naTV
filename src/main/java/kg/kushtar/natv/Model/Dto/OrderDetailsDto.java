package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Orders;
import lombok.Data;

@Data
public class OrderDetailsDto {
    private Long id;
    private OrdersDto order;
    private ChannelsDto channel;
    private double price;

}
