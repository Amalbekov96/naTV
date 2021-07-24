package kg.kushtar.natv.Model;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class OrderDetailsId implements Serializable {

    private static final Long emID = 1L;
    private Long orderId;
    private Long channelId;

}
