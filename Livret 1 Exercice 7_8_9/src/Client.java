import java.util.*;

public class Client {
    private final Map<String, Command> commands;

    public Client() {
        this.commands = new HashMap<>();

        this.commands.put("Hello", new Hello());
        this.commands.put("Bye", new Bye());
        this.commands.put("Composite", new CompositeCommand(new ArrayList<>(List.of(new Command[]{
                new CompositeCommand(new ArrayList<>(List.of(new Command[]{
                        new Hello(),
                        new Hello()
                }))),
                new Bye(),
                new NullCommand(),
                new Hello()
        }))));
    }

    public static void main(String[] args) {
        List<String> commands = Arrays.asList("Hello", "Hello", "Error", "Bye", "Composite");
        Client client = new Client();

        for (String each: commands) {
            client.process(each);
        }

        // Output attendu :
        // Hello
        // Hello
        // Bye
        // Hello
        // Hello
        // Bye
        // Hello
    }

    public void process(String commandName) {
        this.findCommand(commandName).execute();
    }

    private Command findCommand(String commandName) {
        return this.commands.getOrDefault(commandName, NullCommand.getInstance());
    }
}
