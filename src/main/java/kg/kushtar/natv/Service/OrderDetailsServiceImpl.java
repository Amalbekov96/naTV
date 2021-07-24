package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.BaseEntity;
import kg.kushtar.natv.Model.OrderDetails;
import kg.kushtar.natv.Repository.OrderDetailRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsServiceImpl extends BaseServiceImpl<OrderDetails,OrderDetailRepo> {
    protected OrderDetailsServiceImpl(OrderDetailRepo repo) {
        super(repo);
    }
}
