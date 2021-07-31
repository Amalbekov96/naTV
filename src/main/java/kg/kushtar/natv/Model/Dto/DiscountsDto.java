package kg.kushtar.natv.Model.Dto;

import kg.kushtar.natv.Model.Channels;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class DiscountsDto {

    private Long id;
    private double percent;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long minDays;

}
