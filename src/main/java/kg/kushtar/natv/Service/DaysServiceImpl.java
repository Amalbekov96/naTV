package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Days;
import kg.kushtar.natv.Repository.DaysRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DaysServiceImpl extends BaseServiceImpl<Days,DaysRepo> {
    protected DaysServiceImpl(DaysRepo repo) {
        super(repo);
    }
}
