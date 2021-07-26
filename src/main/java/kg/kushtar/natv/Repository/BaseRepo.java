package kg.kushtar.natv.Repository;

import kg.kushtar.natv.Model.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseRepo<E extends BaseEntity> extends JpaRepository<E, Long> {
}
