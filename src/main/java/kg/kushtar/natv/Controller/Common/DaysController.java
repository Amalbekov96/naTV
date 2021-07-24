package kg.kushtar.natv.Controller.Common;

import kg.kushtar.natv.Controller.Base.BaseController;
import kg.kushtar.natv.Model.Days;
import kg.kushtar.natv.Service.DaysServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/days")
public class DaysController extends BaseController<Days, DaysServiceImpl> {
    protected DaysController(DaysServiceImpl service) {
        super(service);
    }
}
