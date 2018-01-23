package rubish.lab7_6;

/**
 * Created by alex323glo on 23.01.18.
 */
public class ExitCommand extends MacroCommand {

    public ExitCommand(Command next) {
        super(next);
    }

    @Override
    public void execute(Window window) {
        if (window.getState() == WindowState.SAVED) {
            System.out.println("ExitCommand: OK. Bye...");
        } else {
            System.out.println("ExitCommand: NO!!! Save it, please!");
            next.execute(window);
        }
    }
}
