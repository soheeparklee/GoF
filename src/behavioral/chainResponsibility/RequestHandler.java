package behavioral.chainResponsibility;

public abstract class RequestHandler {
    private RequestHandler nextHandler; //create chain of handlers

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request){
        if(nextHandler != null){ //if next handler exsits
            nextHandler.handle(request);
        }
    }
}
