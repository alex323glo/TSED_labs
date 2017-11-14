package lab5;

import com.lab111.labwork5.CellState;
import com.lab111.labwork5.GameArea;
import com.lab111.labwork5.GameCell;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by alex323glo on 14.11.17.
 */
public class Test {

    private static GameArea gameArea = new GameArea();
    private static Map<String, GameCell> gameMap = new HashMap<>();

    public static void main(String[] args) {
        // Prepare game space before start:
        prepareGame(2, 2, "0-0", "1-1");

        // Play game:
        System.out.println("\n\n * Game started!");
        gameArea.shoot("1-0");
        gameArea.shoot("0-1");
        gameArea.shoot("0-0");
        gameArea.shoot("1-1");
        gameArea.shoot("0-0");
        System.out.println(" * Game ended!");

    }

    private static void prepareGame(int rows, int cols, String... aliveCellsCoords) {
        // Prepare map (cells):
        prepareGameMap(4, 4);

        // Init game area:
        for (GameCell cell: gameMap.values()) {
            gameArea.addObserver(cell);
        }

        // Set alive cells:
        for (String coord: aliveCellsCoords) {
            gameArea.notifyObservers(coord, "alive");
        }
    }

    private static void prepareGameMap(int rows, int cols) {
        // Validation:
        if (rows < 1 || cols < 1) {
            System.out.println("Can't prepare map!");
        }

        // Creates cells and adds them to map:
        for (int x = 0; x < rows; x++) {
            for (int y = 0; y < cols; y++) {
                gameMap.put(x + "-" + y, new GameCell(x, y, CellState.EMPTY));
            }
        }
    }

}
