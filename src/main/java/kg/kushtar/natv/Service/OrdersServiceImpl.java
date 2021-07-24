package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Orders;
import kg.kushtar.natv.Repository.OrdersRepo;
import kg.kushtar.natv.Service.Base.BaseService;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl extends BaseServiceImpl<Orders,OrdersRepo> {
    public OrdersServiceImpl(OrdersRepo repo) {
        super(repo);
    }
}
