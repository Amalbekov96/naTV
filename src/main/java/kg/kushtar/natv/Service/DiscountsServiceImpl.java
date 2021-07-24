package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Discounts;
import kg.kushtar.natv.Repository.DiscountsRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DiscountsServiceImpl extends BaseServiceImpl<Discounts,DiscountsRepo> {
    protected DiscountsServiceImpl(DiscountsRepo repo) {
        super(repo);
    }
}
