package rubish.lab7_6;

/**
 * Created by alex323glo on 23.01.18.
 */
public class Main {

    public static void main(String[] args) {
        Window window = new Window(
                new SaveCommand(new ConfirmCommand("Saved.")),
                new ExitCommand(new ConfirmCommand("Bye."))
        );



        window.setState(WindowState.UNSAVED);
        window.exit();
        window.save();
        window.exit();
    }

}
