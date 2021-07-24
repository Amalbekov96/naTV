package kg.kushtar.natv.Model.Mapper.Impl;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Dto.ChannelsDto;
import kg.kushtar.natv.Model.Mapper.ChannelsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelsMapperImpl implements ChannelsMapper {

    @Override
    public Channels toEntity(ChannelsDto channelsDto) {
        return ChannelsMapper.INSTANCE.toEntity(channelsDto);
    }

    @Override
    public ChannelsDto toDto(Channels channels) {
        return ChannelsMapper.INSTANCE.toDto(channels);
    }

    @Override
    public List<Channels> toListEntity(List<ChannelsDto> d) {
        return ChannelsMapper.INSTANCE.toListEntity(d);
    }

    @Override
    public List<ChannelsDto> toListDto(List<Channels> e) {
        return ChannelsMapper.INSTANCE.toListDto(e);
    }
}
