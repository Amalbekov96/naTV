package kg.kushtar.natv.Model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Days extends BaseEntity {

    @ManyToOne
    private OrderDetails orderDetails;
    private LocalDateTime day;
}
