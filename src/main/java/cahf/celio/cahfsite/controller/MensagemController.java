package cahf.celio.cahfsite.controller;

import cahf.celio.cahfsite.model.Mensagem;
import cahf.celio.cahfsite.repository.MensagemRepository;
import cahf.celio.cahfsite.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class MensagemController {

    @Autowired
    private MensagemRepository mensagemRepository;

    @Autowired
    private EmailService emailService;

    @PostMapping("/enviar-mensagem")
    public String enviarMensagem(@ModelAttribute @Valid Mensagem mensagem, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "contato"; // ou a página com o formulário
        }

        mensagemRepository.save(mensagem);
        emailService.enviarMensagem(mensagem);
        model.addAttribute("sucesso", "Mensagem enviada com sucesso!");
        return "contato"; // redireciona ou carrega a mesma página com mensagem de sucesso
    }
}
