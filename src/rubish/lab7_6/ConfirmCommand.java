package rubish.lab7_6;

/**
 * Created by alex323glo on 23.01.18.
 */
public class ConfirmCommand extends SimpleCommand {

    public ConfirmCommand() {
    }

    public ConfirmCommand(String message) {
        super(message);
    }

    @Override
    public void execute(Window window) {
        System.out.println("ConfirmCommand: OK! " + getMessage());
    }

}
