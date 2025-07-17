package cahf.celio.cahfsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import cahf.celio.cahfsite.model.Mensagem;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import cahf.celio.cahfsite.service.MensagemService;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class SiteController {

    @Autowired
    private MensagemService mensagemService;

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensagem", new Mensagem());
        return "home";
    }

    @GetMapping("/projetos")
    public String projetos() {
        return "projetos";
    }

    @PostMapping("/contato")
    public String enviarMensagem(@ModelAttribute("mensagem") Mensagem mensagem, Model model) {
        try {
            mensagemService.salvarMensagem(mensagem);
            model.addAttribute("sucesso", "Mensagem enviada com sucesso!");
        } catch (Exception e) {
            model.addAttribute("erro", "Erro ao enviar a mensagem. Tente novamente.");
        }
        return "home";
    }
}
