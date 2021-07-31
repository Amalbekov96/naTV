package kg.kushtar.natv.Service.Base;

import kg.kushtar.natv.Model.BaseEntity;

import java.util.List;

public interface BaseService<E, D> {

    D findById(Long id);
    void deleteById(Long id);
    D update(E e);
    D create(E e);
    List<D> findAll();
}
