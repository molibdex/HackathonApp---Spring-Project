package main.java.com.example.hackathronaplication.component;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class Komponent {

    public JavaMailSender emailSender;

    public void SendSimpleMessage(String to, String subject, String message) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setTo(to);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(message);
        //operacja wyslania maila
        emailSender.send(simpleMailMessage);
    }
}
