package ci.GestCantineADA.GestCantineADA.repositories;

import ci.GestCantineADA.GestCantineADA.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
