package behavioral.command;

public class GameFinishCommand implements Command {
    private Game game;

    public GameFinishCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }
}
