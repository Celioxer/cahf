package cahf.celio.cahfsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import cahf.celio.cahfsite.model.Mensagem;

@Controller
public class SiteController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensagem", new Mensagem());
        return "home";
    }

    @GetMapping("/projetos")
    public String projetos() {
        return "projetos";
    }
}