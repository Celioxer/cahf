package cahf.celio.cahfsite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cahf.celio.cahfsite.service.MensagemService;
import cahf.celio.cahfsite.service.MensagemRepository;

@Service
public class MensagemService {

    @Autowired
    private cahf.celio.cahfsite.service.MensagemRepository mensagemRepository;

    public void enviarMensagem(Mensagem mensagem) {
        mensagemRepository.save(mensagem); // Salva a mensagem no banco de dados
    }
}