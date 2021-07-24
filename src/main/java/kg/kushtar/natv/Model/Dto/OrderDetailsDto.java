package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Orders;
import lombok.Data;

@Data
public class OrderDetailsDto {
    private Orders order;
    private Channels channel;
    private double price;

}
