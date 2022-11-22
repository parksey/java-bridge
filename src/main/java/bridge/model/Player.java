package bridge.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player {
    private String currentMove;
    private int currentLocation;
    private List<List<String>> playerMoveMap;

    public Player() {
        playerMoveMap = new ArrayList<>();
    }
    public String getCurrentMove() {
        return currentMove;
    }

    public void setCurrentMove(String currentMove) {
        this.currentMove = currentMove;
    }

    public int getCurrentLocation() {
        return currentLocation;
    }

    public List<List<String>> getPlayerMoveMap() {
        return playerMoveMap;
    }

    public void addPlayerMove(String move) {
        playerMoveMap.add(List.of(currentMove, move));
        addCurrentLocation();
    }

    public void addCurrentLocation() {
        currentLocation++;
    }
}
