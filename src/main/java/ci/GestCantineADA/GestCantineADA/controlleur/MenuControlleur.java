package ci.GestCantineADA.GestCantineADA.controlleur;

import ci.GestCantineADA.GestCantineADA.services.MenuService;
import ci.GestCantineADA.GestCantineADA.services.dto.MenuDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/menus")
@RequiredArgsConstructor
public class MenuControlleur {

    private final MenuService menuService;

    @GetMapping
    public String showMenuPage(Model model){

        List<MenuDTO> menuDTOS = menuService.findAll();
        model.addAttribute("menus",menuDTOS);

        return "pages/menus";
    }

    @GetMapping("/menu_form")
    public String show_Add_Plat_form(){

        return "pages/menu_form";
    }


}
