package ci.GestCantineADA.GestCantineADA.services.mapper;

import ci.GestCantineADA.GestCantineADA.models.Plat;
import ci.GestCantineADA.GestCantineADA.services.dto.PlatDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PlatMapper extends EntityMapper<PlatDTO, Plat>{
}
