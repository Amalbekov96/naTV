package kg.kushtar.natv.Repository;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Discounts;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface DiscountsRepo extends BaseRepo<Discounts> {

    @Query(value = "Select * from Discounts t where CURRENT_DATE BETWEEN t.start_date and t.end_date and t.channel_id = :id", nativeQuery = true)
    List<Discounts> findAllByChannelId(@Param("id") Long id);
}
