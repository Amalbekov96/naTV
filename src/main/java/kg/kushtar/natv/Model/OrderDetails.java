package kg.kushtar.natv.Model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "order_details")
public class OrderDetails extends BaseEntity {

    @ManyToOne
    private Channels channel;

    @ManyToOne
    private Orders order;

    @Column(name = "price")
    private double price;
}
