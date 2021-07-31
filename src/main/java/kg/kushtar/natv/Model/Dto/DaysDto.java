package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.OrderDetails;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
@Data
public class DaysDto {
    private Long id;
    private OrderDetailsDto orderDetails;
    private LocalDate day;

}
