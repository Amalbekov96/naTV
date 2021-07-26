package kg.kushtar.natv.Service.Base;

import kg.kushtar.natv.Model.BaseEntity;

import java.util.List;

public interface BaseService<E extends BaseEntity> {

    E findById(Long id);
    void deleteById(Long id);
    E update(E dto);
    E create(E dto);
    List<E> findAll();
}
