package kg.kushtar.natv.Model.Mapper;


import kg.kushtar.natv.Model.BaseEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BaseMapper <E extends BaseEntity, D>{

    E toEntity(D d);
    D toDto(E e);

    List<E> toListEntity(List<D> d);
    List<D> toListDto(List<E> e);
}
