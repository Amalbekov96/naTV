package kg.kushtar.natv.Model.Mapper;

import kg.kushtar.natv.Model.Channels;
import kg.kushtar.natv.Model.Dto.ChannelsDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ChannelsMapper extends BaseMapper<Channels, ChannelsDto>{
    ChannelsMapper INSTANCE = Mappers.getMapper(ChannelsMapper.class);
}
