package kg.kushtar.natv.Controller.Common;

import kg.kushtar.natv.Controller.Base.BaseController;
import kg.kushtar.natv.Model.Orders;
import kg.kushtar.natv.Service.OrdersServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/orders")
public class OrdersController extends BaseController<Orders, OrdersServiceImpl> {
    protected OrdersController(OrdersServiceImpl service) {
        super(service);
    }
}
