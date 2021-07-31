package kg.kushtar.natv.Controller.Common;

import kg.kushtar.natv.Controller.Base.BaseController;
import kg.kushtar.natv.Model.Discounts;
import kg.kushtar.natv.Model.Dto.DiscountsDto;
import kg.kushtar.natv.Service.DiscountsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/discounts")
public class DiscountsController extends BaseController<Discounts, DiscountsDto, DiscountsServiceImpl> {
    protected DiscountsController(DiscountsServiceImpl service) {
        super(service);
    }
}
