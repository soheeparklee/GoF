package structural.bridge.message;

public abstract class Message {
    private MessageSender messageSender; //bridge between abstract, implementation

    protected Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void send(String message);
}
