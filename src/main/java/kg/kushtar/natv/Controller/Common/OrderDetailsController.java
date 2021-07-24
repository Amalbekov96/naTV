package kg.kushtar.natv.Controller.Common;

import kg.kushtar.natv.Controller.Base.BaseController;
import kg.kushtar.natv.Model.OrderDetails;
import kg.kushtar.natv.Service.OrderDetailsServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/orderDetails")
public class OrderDetailsController extends BaseController<OrderDetails, OrderDetailsServiceImpl> {
    protected OrderDetailsController(OrderDetailsServiceImpl service) {
        super(service);
    }
}
