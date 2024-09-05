package ci.GestCantineADA.GestCantineADA.services.impl;


import ci.GestCantineADA.GestCantineADA.models.Menu;
import ci.GestCantineADA.GestCantineADA.repositories.MenuRepository;
import ci.GestCantineADA.GestCantineADA.services.MenuService;
import ci.GestCantineADA.GestCantineADA.services.dto.MenuDTO;
import ci.GestCantineADA.GestCantineADA.services.mapper.MenuMapperImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;
    private final MenuMapperImpl menuMapper;

    @Override
    public MenuDTO save(MenuDTO menuDTO) {
        log.debug("Resqurst to save : {}",menuDTO);
        Menu menu = menuMapper.toEntity(menuDTO);
        menu= menuRepository.save(menu);
        return menuMapper.toDto(menu);
    }

    @Override
    public MenuDTO update(MenuDTO menuDTO) {
        Menu menu = menuMapper.toEntity(menuDTO);
        menu = menuRepository.save(menu);
        return menuMapper.toDto(menu);
    }

    @Override
    public Optional<MenuDTO> findOne(Long id) {
        return menuRepository.findById(id).map(menu -> {
            return menuMapper.toDto(menu);
        });
    }

    @Override
    public List<MenuDTO> findAll() {
        return menuRepository.findAll().stream().map(student -> {
            return menuMapper.toDto(student);
        }).toList();
    }

    @Override
    public void delecte(Long id) {
        menuRepository.deleteById(id);
    }
}
