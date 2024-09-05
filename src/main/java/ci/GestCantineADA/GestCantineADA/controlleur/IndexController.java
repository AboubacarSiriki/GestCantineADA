package ci.GestCantineADA.GestCantineADA.controlleur;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
@RequiredArgsConstructor
public class IndexController {

    @GetMapping
    public String index(){
        return "/pages/index";
    }
}
