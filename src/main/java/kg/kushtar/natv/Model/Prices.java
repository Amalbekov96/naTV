package kg.kushtar.natv.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Channels channel;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private double price;

}
