package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Dto.OrdersDto;
import kg.kushtar.natv.Model.Mapper.OrdersMapper;
import kg.kushtar.natv.Model.Orders;
import kg.kushtar.natv.Repository.OrdersRepo;
import kg.kushtar.natv.Service.Base.BaseService;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl extends BaseServiceImpl<Orders, OrdersDto, OrdersMapper,OrdersRepo> {
    public OrdersServiceImpl(OrdersRepo repo, OrdersMapper mapper) {
        super(repo, mapper);
    }
}
