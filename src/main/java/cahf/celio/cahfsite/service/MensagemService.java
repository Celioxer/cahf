package cahf.celio.cahfsite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cahf.celio.cahfsite.model.Mensagem;
import cahf.celio.cahfsite.repository.MensagemRepository;

@Service
public class MensagemService {

    @Autowired
    private MensagemRepository mensagemRepository;

    public void enviarMensagem(Mensagem mensagem) {
        mensagemRepository.save(mensagem); // Salva a mensagem no banco de dados
    }
}