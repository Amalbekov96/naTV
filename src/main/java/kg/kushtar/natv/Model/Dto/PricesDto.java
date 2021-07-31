package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.Channels;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class PricesDto {
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double price;

}
