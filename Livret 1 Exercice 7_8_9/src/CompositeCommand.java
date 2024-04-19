import java.util.ArrayList;

public class CompositeCommand implements Command {
    private final ArrayList<Command> commands;

    public CompositeCommand(ArrayList<Command> commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command: this.commands) {
            command.execute();
        }
    }
}
