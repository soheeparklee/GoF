package behavioral.command;

import java.util.Stack;

public class Button {
    private Stack<Command> commands = new Stack<>();

    public void press(Command command){
        command.execute();
        commands.push(command);
    }

    public void undo(){
        if(!commands.isEmpty()){
            Command command = commands.pop();
            //command.undo();
        }
    }

    public static void main(String[] args) {
        Button button1 = new Button();
        button1.press(new LightsOnCommand(new Light()));
        Button button2 = new Button();
        button2.press(new GameStartCommand(new Game()));

        button1.undo();
        button2.undo();

    }
}



