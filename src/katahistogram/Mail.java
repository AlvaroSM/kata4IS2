package katahistogram;

public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getDomain() {
        return mail.substring(mail.indexOf("@"));
    }
}
