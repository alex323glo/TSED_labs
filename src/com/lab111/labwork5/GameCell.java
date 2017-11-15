package com.lab111.labwork5;

/**
 * Game area cell entity, which has logic of observer (subscriber).
 *
 * @author alex323glo
 * @version 1.0.0
 *
 * @see GameObserver
 * */
public class GameCell implements GameObserver {

    private int x;
    private int y;

    private CellState state;

    /**
     * Constructor with parameters.
     * */
    public GameCell(int x, int y, CellState state) {
        this.x = x;
        this.y = y;
        this.state = state;
    }

    /**
     * Updates state of this observer.
     *
     * @param message notification message, which is used to delegate
     *                change of state.
     * @param newState initial value of new state of this observer.
     * */
    @Override
    public void updateState(String message, String newState) {
        if (message == null || newState == null) {
            System.out.println("(null-null): ...");
            return;
        }

        String[] cellCoords = message.split("-");
        if (Integer.valueOf(cellCoords[0]) == x && Integer.valueOf(cellCoords[1]) == y) {
            state = cellStateSwitcher(newState, state);
        }
    }

    /**
     * Generates new state using proposed state and old state.
     *
     * @param stringState proposed state, presented as string.
     *
     * @param oldState current cell state value.
     *
     * @see CellState
     * */
    private CellState cellStateSwitcher(String stringState, CellState oldState) {
        if (stringState == null) {
            return null;
        }

        CellState result = null;

        switch (stringState.toLowerCase()) {
            case "empty":
                result = CellState.EMPTY;
                System.out.printf("(%d-%d): reassigned as EMPTY\n", x, y);
                break;
            case "alive":
                result = CellState.ALIVE;
                System.out.printf("(%d-%d): reassigned as ALIVE\n", x, y);
                break;
            case "dead":
                switch (oldState) {
                    case ALIVE:
                        result = CellState.DEAD;
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

        return result;
    }
}
