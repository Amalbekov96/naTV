package kg.kushtar.natv.Repository;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Prices;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Locale;

@Repository
public interface PricesRepo extends BaseRepo<Prices> {
//    Prices findByChannel(Channels channels);

    @Query(value = "Select * from Prices t  where CURRENT_DATE BETWEEN t.start_date and t.end_date and t.channel_id = :id", nativeQuery = true)
    Prices findPricesByChannelId(@Param("id") Long id);
}
