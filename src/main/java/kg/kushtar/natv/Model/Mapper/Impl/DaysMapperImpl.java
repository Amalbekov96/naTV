package kg.kushtar.natv.Model.Mapper.Impl;

import kg.kushtar.natv.Model.Days;
import kg.kushtar.natv.Model.Dto.DaysDto;
import kg.kushtar.natv.Model.Mapper.DaysMapper;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DaysMapperImpl implements DaysMapper {
    @Override
    public Days toEntity(DaysDto daysDto) {
        return DaysMapper.INSTANCE.toEntity(daysDto);
    }

    @Override
    public DaysDto toDto(Days days) {
        return DaysMapper.INSTANCE.toDto(days);
    }

    @Override
    public List<Days> toListEntity(List<DaysDto> d) {
        return DaysMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<DaysDto> toListDto(List<Days> e) {
        return DaysMapper.INSTANCE.toListDto(e);
    }

}
