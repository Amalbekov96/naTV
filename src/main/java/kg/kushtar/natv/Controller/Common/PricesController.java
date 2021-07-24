package kg.kushtar.natv.Controller.Common;

import kg.kushtar.natv.Controller.Base.BaseController;
import kg.kushtar.natv.Model.Prices;
import kg.kushtar.natv.Service.PricesServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/prices")
public class PricesController extends BaseController<Prices, PricesServiceImpl> {
    protected PricesController(PricesServiceImpl service) {
        super(service);
    }
}
