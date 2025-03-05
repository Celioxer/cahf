package cahf.celio.cahfsite;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensagem", new Mensagem()); // Cria um novo objeto Mensagem
        return "home";
    }

    @PostMapping("/contato")
    public String enviarMensagem(@ModelAttribute Mensagem mensagem, Model model) {
        // Exibe os dados no console (apenas para teste)
        System.out.println("Mensagem recebida:");
        System.out.println("Nome: " + mensagem.getNome());
        System.out.println("Email: " + mensagem.getEmail());
        System.out.println("Mensagem: " + mensagem.getMensagem());

        // Adiciona uma mensagem de sucesso ao modelo
        model.addAttribute("sucesso", "Mensagem enviada com sucesso!");

        return "home"; // Retorna para a página inicial
    }
}