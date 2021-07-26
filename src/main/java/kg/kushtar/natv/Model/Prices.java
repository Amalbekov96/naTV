package kg.kushtar.natv.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Prices extends BaseEntity {

    @OneToOne
    private Channels channel;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double price;

}
