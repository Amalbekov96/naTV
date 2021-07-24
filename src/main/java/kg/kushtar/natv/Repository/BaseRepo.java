package kg.kushtar.natv.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


public interface BaseRepo<E> extends JpaRepository<E, Long> {
}
