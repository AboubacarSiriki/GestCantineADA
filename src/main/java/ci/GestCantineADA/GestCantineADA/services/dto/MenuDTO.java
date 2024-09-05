package ci.GestCantineADA.GestCantineADA.services.dto;

import ci.GestCantineADA.GestCantineADA.models.Plat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class MenuDTO {

    private Long id;

    private Instant creation_date;

}
