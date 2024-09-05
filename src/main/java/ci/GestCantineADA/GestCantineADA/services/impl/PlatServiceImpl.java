package ci.GestCantineADA.GestCantineADA.services.impl;

import ci.GestCantineADA.GestCantineADA.models.Plat;
import ci.GestCantineADA.GestCantineADA.repositories.PlatRepository;
import ci.GestCantineADA.GestCantineADA.services.PlatService;
import ci.GestCantineADA.GestCantineADA.services.dto.PlatDTO;
import ci.GestCantineADA.GestCantineADA.services.mapper.PlatMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
@Service
public class PlatServiceImpl implements PlatService {

    private final PlatRepository platRepository;
    private  final PlatMapper platMapper;

    @Override
    public PlatDTO save(PlatDTO platDTO) {
        log.debug("Resqurst to save : {}",platDTO);
        Plat plat = platMapper.toEntity(platDTO);
        plat= platRepository.save(plat);
        return platMapper.toDto(plat);
    }

    @Override
    public PlatDTO update(PlatDTO platDTO) {
        Plat plat = platMapper.toEntity(platDTO);
        plat = platRepository.save(plat);
        return platMapper.toDto(plat);
    }

    @Override
    public Optional<PlatDTO> findOne(Long id) {
        return platRepository.findById(id).map(plat -> {
            return platMapper.toDto(plat);
        });
    }

    @Override
    public List<PlatDTO> findAll() {
        return platRepository.findAll().stream().map(plat -> {
            return platMapper.toDto(plat);
        }).toList();
    }

    @Override
    public void delecte(Long id) {

        platRepository.deleteById(id);

    }
}
