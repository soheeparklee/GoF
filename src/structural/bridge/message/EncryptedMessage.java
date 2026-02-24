package structural.bridge.message;

public class EncryptedMessage extends Message{
    protected EncryptedMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        System.out.println("EncryptedMessage");
    }
}
