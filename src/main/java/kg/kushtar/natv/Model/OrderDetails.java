package kg.kushtar.natv.Model;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
public class OrderDetails {

    @EmbeddedId
    private OrderDetailsId emID = new OrderDetailsId();


    @ManyToOne
    @MapsId("channelId")
    private Channels channel;

    @ManyToOne
    @MapsId("orderId")
    private Orders order;

    @Column(name = "price")
    private double price;
}
