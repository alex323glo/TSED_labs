package rubish.lab7_6;

/**
 * Created by alex323glo on 23.01.18.
 */
public abstract class SimpleCommand implements Command {

    private String message;

    public SimpleCommand() {
    }

    public SimpleCommand(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
