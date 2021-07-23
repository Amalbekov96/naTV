package kg.kushtar.natv.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Channels {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    private Boolean active;

    @OneToMany(mappedBy = "channels")
    List<OrderDetails> orders;
}
