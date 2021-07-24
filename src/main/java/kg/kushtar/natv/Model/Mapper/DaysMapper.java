package kg.kushtar.natv.Model.Mapper;

import kg.kushtar.natv.Model.Days;
import kg.kushtar.natv.Model.Dto.DaysDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface DaysMapper extends BaseMapper<Days, DaysDto>{
    DaysMapper INSTANCE = Mappers.getMapper(DaysMapper.class);
}
