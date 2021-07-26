package kg.kushtar.natv.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Discounts extends BaseEntity {

    @ManyToOne
    private Channels channel;
    private double percent;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private Long minDays;
}
