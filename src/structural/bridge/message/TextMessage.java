package structural.bridge.message;

public class TextMessage extends Message{
    protected TextMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send(String message) {
        System.out.println("text message");
    }
}
