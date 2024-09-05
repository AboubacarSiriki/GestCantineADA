package ci.GestCantineADA.GestCantineADA;

import ci.GestCantineADA.GestCantineADA.services.MenuService;
import ci.GestCantineADA.GestCantineADA.services.PlatService;
import ci.GestCantineADA.GestCantineADA.services.dto.MenuDTO;
import ci.GestCantineADA.GestCantineADA.services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Instant;

@RequiredArgsConstructor
@SpringBootApplication
public class GestCantineAdaApplication implements CommandLineRunner {

	@Autowired
	private PlatService platService;

	@Autowired
	private MenuService menuService;

	public static void main(String[] args) {
		SpringApplication.run(GestCantineAdaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		MenuDTO menu = new MenuDTO();
		PlatDTO plat = new PlatDTO();

		plat.setName("Attiéké");
		plat.setSummary("Attiéké avec poussons");

		menu.setCreation_date(Instant.now());
		menuService.save(menu);
		platService.save(plat);

	}
}
