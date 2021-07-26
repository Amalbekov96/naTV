package kg.kushtar.natv.Model;


import kg.kushtar.natv.Model.Enum.Orderstatus;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Orders extends BaseEntity{

    private String text;
    private String name;
    private String phone;
    private String email;
    private Double totalPrice;
    private LocalDateTime addDate;
    private LocalDateTime editDate;
    private Orderstatus status;
    @OneToMany(mappedBy = "channel", cascade = CascadeType.ALL, orphanRemoval = true)
    List<OrderDetails> channels;
}
