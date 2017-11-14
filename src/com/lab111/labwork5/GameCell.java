package com.lab111.labwork5;

// TODO add doc.
/**
 * Created by alex323glo on 14.11.17.
 */
public class GameCell implements GameObserver {

    private int x;
    private int y;

    private CellState state;

    public GameCell(int x, int y, CellState state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    @Override
    public void updateState(String message, String newState) {
        if (message == null || state == null) {
            System.out.println("()");
            return;
        }

        String[] cellCoords = message.split("-");
        if (Integer.valueOf(cellCoords[0]) == x && Integer.valueOf(cellCoords[1]) == y) {
            switch (newState.toLowerCase()) {
                case "empty":
                    state = CellState.EMPTY;
                    System.out.printf("(%d-%d): reassigned as EMPTY\n", x, y);
                    break;
                case "alive":
                    state = CellState.ALIVE;
                    System.out.printf("(%d-%d): reassigned as ALIVE\n", x, y);
                    break;
                case "dead":
                    switch (state) {
                        case ALIVE:
                            state = CellState.DEAD;
                            System.out.printf("(%d-%d): Killed!\n", x, y);
                            break;
                        case EMPTY:
                            System.out.printf("(%d-%d): Missed (cell is empty)!\n", x, y);
                            break;
                        case DEAD:
                            System.out.printf("(%d-%d): Already dead (can't kill twice)!\n", x, y);
                            break;
                    }
                    break;
            }
        }
    }
}
