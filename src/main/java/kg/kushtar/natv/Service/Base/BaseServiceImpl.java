package kg.kushtar.natv.Service.Base;

import kg.kushtar.natv.Model.BaseEntity;
import kg.kushtar.natv.Repository.BaseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseServiceImpl<E extends BaseEntity,R extends BaseRepo<E>> implements BaseService<E>{

    private final R repo;

    protected BaseServiceImpl(R repo) {
        this.repo = repo;
    }

    @Override
    public E create(E dto) {
        return repo.save(dto);
    }

    @Override
    public E findById(Long id) {
        return repo.findById(id).orElseThrow(()-> new RuntimeException("Not found!"));
    }

    @Override
    public E update(E dto) {
        return repo.save(dto);
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<E> findAll() {
        return repo.findAll();
    }
}
