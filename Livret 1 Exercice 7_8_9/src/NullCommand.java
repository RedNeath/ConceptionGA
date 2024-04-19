public class NullCommand implements Command {
    private static NullCommand instance;

    public void execute() {}

    public static NullCommand getInstance() {
        NullCommand localInstance = instance == null?
                new NullCommand():
                instance
        ;

        instance = localInstance;

        return localInstance;
    }
}
