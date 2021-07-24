package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.Enum.Orderstatus;
import kg.kushtar.natv.Model.OrderDetails;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrdersDto {
    private Long id;
    private String text;
    private String name;
    private String phone;
    private String email;
    private Double totalPrice;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
    private Orderstatus status;
    List<OrderDetails> channels;
}
