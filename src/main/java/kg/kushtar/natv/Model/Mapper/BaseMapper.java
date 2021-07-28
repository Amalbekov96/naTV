package kg.kushtar.natv.Model.Mapper;


import org.springframework.data.domain.Page;

import java.util.List;

public interface BaseMapper <E, D>{

    E toEntity(D d);
    D toDto(E e);

    List<E> toListEntity(List<D> d);
    List<D> toListDto(List<E> e);

//    Page<E> toPageEntity(Page<D> d);
//    Page<D> toPageDto(Page<E> e);
}
