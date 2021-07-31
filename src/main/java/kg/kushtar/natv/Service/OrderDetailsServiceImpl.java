package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.BaseEntity;
import kg.kushtar.natv.Model.Dto.OrderDetailsDto;
import kg.kushtar.natv.Model.Mapper.OrderDetailsMapper;
import kg.kushtar.natv.Model.OrderDetails;
import kg.kushtar.natv.Repository.OrderDetailRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailsServiceImpl extends BaseServiceImpl<OrderDetails, OrderDetailsDto, OrderDetailsMapper,OrderDetailRepo> {
    public OrderDetailsServiceImpl(OrderDetailRepo repo, OrderDetailsMapper mapper) {
        super(repo, mapper);
    }
}
