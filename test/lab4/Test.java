package lab4;

import com.lab111.labwork4.v4.*;

/**
 * Created by alex323glo on 02.11.17.
 */
public class Test {

    public static void main(String[] args) {

        DotPool dotPool = DotPool.getInstance();

        RectImage rectImage = new RectImage();

        rectImage
                .addDot(new FlyweightDot(dotPool.getDot("127;0;0"), new Coords(0, 0)))
                .addDot(new FlyweightDot(dotPool.getDot("127;0;0"), new Coords(0, 1)))
                .addDot(new FlyweightDot(dotPool.getDot("127;0;255"), new Coords(0, 2)))
                .addDot(new FlyweightDot(dotPool.getDot("127;0;0"), new Coords(0, 3)))
                .addDot(new FlyweightDot(dotPool.getDot("127;0;255"), new Coords(1, 0)))
                .addDot(new FlyweightDot(dotPool.getDot("0;0;0"), new Coords(2, 1)))
                .addDot(new FlyweightDot(dotPool.getDot("127;0;0"), new Coords(3, 2)))
                .addDot(new FlyweightDot(dotPool.getDot("0;0;0"), new Coords(4, 3)))
                .show();
    }

}
