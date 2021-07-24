package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Prices;
import kg.kushtar.natv.Repository.PricesRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class PricesServiceImpl extends BaseServiceImpl<Prices, PricesRepo> {
    public PricesServiceImpl(PricesRepo repo) {
        super(repo);
    }
}
