package ci.GestCantineADA.GestCantineADA.controlleur;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plats")
@RequiredArgsConstructor
public class PlatControlleur {

    @GetMapping
    public String shoPlatPage(){
        return "pages/plats";
    }

    @GetMapping("/plats_form")
    public String show_Add_Plat_form(){
        return "pages/forms";
    }
}
