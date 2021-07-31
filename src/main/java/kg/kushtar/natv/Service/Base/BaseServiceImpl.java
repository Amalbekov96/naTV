package kg.kushtar.natv.Service.Base;

import kg.kushtar.natv.Exception.EntityNotFound;
import kg.kushtar.natv.Model.BaseEntity;
import kg.kushtar.natv.Model.Mapper.BaseMapper;
import kg.kushtar.natv.Repository.BaseRepo;

import java.util.List;

public class BaseServiceImpl<E extends BaseEntity, D , M extends BaseMapper<E, D>,R extends BaseRepo<E>> implements BaseService<E, D> {

    private R repo;
    private M mapper;

    public BaseServiceImpl(R repo, M mapper) {
        this.repo = repo;
        this.mapper = mapper;
    }

    public BaseServiceImpl() {
    }

    @Override
    public D findById(Long id) {
        return mapper.toDto( repo.findById(id).orElseThrow(()-> new EntityNotFound("Was not found sorry")));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public D update(E e) {
        return mapper.toDto(repo.save(e));
    }

    @Override
    public D create(E e) {
        return mapper.toDto(repo.save(e));
    }

    @Override
    public List<D> findAll() {
        return mapper.toListDto(repo.findAll());
    }
}
