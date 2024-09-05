package ci.GestCantineADA.GestCantineADA.services;

import ci.GestCantineADA.GestCantineADA.services.dto.PlatDTO;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    PlatDTO save(PlatDTO platDTO);

    PlatDTO update(PlatDTO platDTO);

    Optional<PlatDTO> findOne(Long id);

    List<PlatDTO> findAll();

    void delecte(Long id);

}
