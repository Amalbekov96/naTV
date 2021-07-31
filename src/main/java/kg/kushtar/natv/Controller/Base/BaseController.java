package kg.kushtar.natv.Controller.Base;

import kg.kushtar.natv.Model.BaseEntity;
import kg.kushtar.natv.Model.Mapper.BaseMapper;
import kg.kushtar.natv.Service.Base.BaseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController <E extends BaseEntity, D, S extends BaseService<E, D>>{
    private final S service;

    protected BaseController(S service) {
        this.service = service;
    }

    @GetMapping("/findById/{id}")
    D findById(@PathVariable Long id) {return this.service.findById(id);}

    @PutMapping("/update")
    D update(@RequestBody E e){return  this.service.update(e);}

    @PostMapping("/create")
    D create(@RequestBody E e){return this.service.create(e);}

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){ this.service.deleteById(id);}

    @GetMapping("/findAll")
    List<D> findAll(){ return this.service.findAll();}
}
