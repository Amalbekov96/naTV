package kg.kushtar.natv.Model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Channels extends BaseEntity {

    private String name;
    private String image;
    private Boolean active;
    private String order_num;
}
