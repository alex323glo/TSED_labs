package rubish.lab7_6;

/**
 * Created by alex323glo on 23.01.18.
 */
public class SaveCommand extends MacroCommand {

    public SaveCommand(Command next) {
        super(next);
    }

    @Override
    public void execute(Window window) {
        System.out.println("SaveCommand: OK, boy B) We've saved it! $$$");
        window.setState(WindowState.SAVED);
        next.execute(window);
    }
}
