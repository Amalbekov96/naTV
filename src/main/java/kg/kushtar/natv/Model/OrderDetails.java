package kg.kushtar.natv.Model;
import javax.persistence.*;

@Entity
@Table(name = "order_details")
public class OrderDetails {
    @Id @ManyToOne @JoinColumn(name = "order_id")
    private Orders order;

    @Id @ManyToOne @JoinColumn(name = "channel_id")
    private Channels channel;

    @Column(name = "PRICE")
    private double price;
}
