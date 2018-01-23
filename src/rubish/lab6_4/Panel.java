package rubish.lab6_4;

/**
 * Created by alex323glo on 23.01.18.
 */
public class Panel extends Element {

    private Element[] elements;


    @Override
    public void react(int x, int y) {
        for (Element element: elements) {
            if (element.x == x && element.y == y) {
                element.react(x, y);
            }
        }
    }
}
