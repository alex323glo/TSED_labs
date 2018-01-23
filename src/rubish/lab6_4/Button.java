package rubish.lab6_4;

/**
 * Created by alex323glo on 23.01.18.
 */
public class Button extends Element {

    private String message;

    @Override
    public void react(int x, int y) {
        System.out.println("You've pressed me ! (" + x + "; " + y + ")");
    }
}
