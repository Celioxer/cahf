package cahf.celio.cahfsite.service;

import cahf.celio.cahfsite.model.Mensagem;
import cahf.celio.cahfsite.repository.MensagemRepository;
import org.springframework.stereotype.Service;

@Service
public class MensagemService {

    private final MensagemRepository mensagemRepository;

    public MensagemService(MensagemRepository mensagemRepository) {
        this.mensagemRepository = mensagemRepository;
    }

    public void salvarMensagem(Mensagem mensagem) {
        mensagemRepository.save(mensagem);
    }
}