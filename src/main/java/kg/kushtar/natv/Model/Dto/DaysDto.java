package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.OrderDetails;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class DaysDto {
    private Long id;
    private OrderDetails orderDetails;
    private LocalDateTime day;

}
