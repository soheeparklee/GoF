package structural.bridge.message;

public class App {
    public static void main(String[] args) {
        MessageSender email = new EmailSender();
        MessageSender sms = new SMSSender();

        Message textEmail = new TextMessage(email);
        Message encryptedEmail = new EncryptedMessage(email);
        Message textSMS = new TextMessage(sms);
        Message encryptedSMS = new EncryptedMessage(sms);
    }
}
