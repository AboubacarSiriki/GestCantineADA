package ci.GestCantineADA.GestCantineADA.controlleur;

import ci.GestCantineADA.GestCantineADA.models.Plat;
import ci.GestCantineADA.GestCantineADA.services.PlatService;
import ci.GestCantineADA.GestCantineADA.services.dto.MenuDTO;
import ci.GestCantineADA.GestCantineADA.services.dto.PlatDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/plats")
@RequiredArgsConstructor
@Slf4j
public class PlatControlleur {

    private final PlatService platService;

    @GetMapping
    public String shoPlatPage(Model model){

        List<PlatDTO> platDTOS = platService.findAll();
        model.addAttribute("plats",platDTOS);
        return "pages/plats";
    }

    @GetMapping("/plats_form")
    public String show_Add_Plat_form(Model model){

        log.debug("Request to show add platforms");
        model.addAttribute("plats", new Plat());
        return "pages/forms";
    }

    @PostMapping
    public String saveStudent(PlatDTO platDTO){

        log.debug("Request to save plats: {}",platDTO);
        platService.save(platDTO);
        return "redirect:/plats";
    }

    @GetMapping("/updateplats/{id}")
    public String showModifierplat(Model model, @PathVariable Long id){
        log.debug("Request to show update plats forms");
        Optional<PlatDTO> plat = platService.findOne(id);
        if (plat.isPresent()){
            model.addAttribute("plat" , plat.get());
            return "pages/forms";
        } else {
            return "redirect:/plats";
        }

    }
}
