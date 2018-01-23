package rubish.lab7_6;

/**
 * Created by alex323glo on 23.01.18.
 */
public class Window {

    private WindowState state;

    private Command save;
    private Command exit;

    public Window() {
        state = WindowState.SAVED;
    }

    public Window(Command save, Command exit) {
        this.save = save;
        this.exit = exit;
        state = WindowState.SAVED;
    }

    public WindowState getState() {
        return state;
    }

    public void setState(WindowState state) {
        this.state = state;
    }

    public void exit() {
        exit.execute(this);
    }

    public void save() {
        save.execute(this);
    }
}
