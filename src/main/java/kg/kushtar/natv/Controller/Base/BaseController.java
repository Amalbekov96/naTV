package kg.kushtar.natv.Controller.Base;

import kg.kushtar.natv.Model.BaseEntity;
import kg.kushtar.natv.Model.Mapper.BaseMapper;
import kg.kushtar.natv.Service.Base.BaseService;
import org.springframework.web.bind.annotation.*;

public abstract class BaseController <E , S extends BaseService<E>>{
    private final S service;

    protected BaseController(S service) {
        this.service = service;
    }

    @GetMapping("/findById/{id}")
    E findById(@PathVariable Long id) {return this.service.findById(id);}

    @PutMapping("/update")
    E update(@RequestBody E e){return  this.service.update(e);}

    @PostMapping("/create")
    E create(@RequestBody E e){return this.service.create(e);}

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable Long id){ this.service.deleteById(id);}


}
