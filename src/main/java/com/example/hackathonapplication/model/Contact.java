package main.java.com.example.hackathronaplication.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idc;

    @NotBlank(message = "to pole nie moze byc puste")
    String content;

    @NotBlank(message = "to pole nie moze byc puste")
    String signature;
    @Email(message = "niepoprawny adres email")
    @NotBlank(message = "to pole nie moze byc puste")
    String email;

    public Contact() {
    }

    public Contact(@NotBlank(message = "to pole nie moze byc puste") String content, @NotBlank(message = "to pole nie moze byc puste") String signature, @Email(message = "niepoprawny adres email") @NotBlank(message = "to pole nie moze byc puste") String email) {
        this.content = content;
        this.signature = signature;
        this.email = email;
    }

    public Long getIdc() {
        return idc;
    }

    public void setIdc(Long idc) {
        this.idc = idc;
    }

    private String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    private String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
