package kg.kushtar.natv.Repository;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Discounts;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountsRepo extends BaseRepo<Discounts> {
    List<Discounts> findAllByChannel(Channels channels);
}
