package ci.GestCantineADA.GestCantineADA.services.mapper;

import ci.GestCantineADA.GestCantineADA.models.Menu;
import ci.GestCantineADA.GestCantineADA.services.dto.MenuDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuMapper extends EntityMapper<MenuDTO, Menu>{
}
