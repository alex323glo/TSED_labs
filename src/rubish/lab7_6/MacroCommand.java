package rubish.lab7_6;

/**
 * Created by alex323glo on 23.01.18.
 */
public abstract class MacroCommand implements Command {

    protected Command next;

    public MacroCommand(Command next) {
        this.next = next;
    }

    public Command getNext() {
        return next;
    }

    public void setNext(Command next) {
        this.next = next;
    }
}
