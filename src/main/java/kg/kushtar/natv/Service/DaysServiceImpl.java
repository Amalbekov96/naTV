package kg.kushtar.natv.Service;

import kg.kushtar.natv.Model.Days;
import kg.kushtar.natv.Model.Dto.DaysDto;
import kg.kushtar.natv.Model.Mapper.DaysMapper;
import kg.kushtar.natv.Repository.DaysRepo;
import kg.kushtar.natv.Service.Base.BaseServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class DaysServiceImpl extends BaseServiceImpl<Days, DaysDto, DaysMapper,DaysRepo> {
    public DaysServiceImpl(DaysRepo repo, DaysMapper mapper) {
        super(repo, mapper);
    }
}
