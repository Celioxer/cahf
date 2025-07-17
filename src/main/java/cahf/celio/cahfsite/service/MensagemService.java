package cahf.celio.cahfsite.service;

import cahf.celio.cahfsite.model.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    @Autowired
    private EmailService emailService;

    public void salvarMensagem(Mensagem mensagem) {
        // aqui você poderia salvar no banco se quiser
        emailService.enviarMensagem(mensagem);
        // envia o e-mail
    }
}
