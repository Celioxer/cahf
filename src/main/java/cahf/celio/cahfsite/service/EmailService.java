package cahf.celio.cahfsite.service;

import cahf.celio.cahfsite.model.Mensagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    private final JavaMailSender mailSender;

    @Autowired
    public EmailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void enviarMensagem(Mensagem mensagem) {
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo("celioxer@gmail.com"); // Substitua por seu email de destino
        email.setSubject("Mensagem de: " + mensagem.getNome());
        email.setText("Mensagem enviada por: " + mensagem.getEmail() + "\n\n" + mensagem.getTexto());

        mailSender.send(email);
    }
}
