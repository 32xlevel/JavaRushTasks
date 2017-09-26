package com.javarush.task.task35.task3513;

import java.util.ArrayList;
import java.util.List;

// будет содержать игровую логику и хранить игровое поле
public class Model {

    ////// Fields:
    private static final int FIELD_WIDTH = 4;
    private Tile[][] gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];

    ////// Constructors:
    public Model() {
        resetGameTiles();
    }

    /////// Methods:
    void resetGameTiles() {
        for(int i = 0; i < FIELD_WIDTH; i++) {
            for(int j = 0; j < FIELD_WIDTH; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
    }

    private List<Tile> getEmptyTiles() {
        List<Tile> emptyTiles = new ArrayList<>();
        for(int i = 0; i < FIELD_WIDTH; i++) {
            for(int j = 0; j < FIELD_WIDTH; j++) {
                if(gameTiles[i][j].value == 0) {
                    emptyTiles.add(gameTiles[i][j]);
                }
            }
        }
        return emptyTiles;
    }

    private void addTile() {
        List<Tile> emptyTiles = getEmptyTiles();
        int index = (int) (emptyTiles.size() * Math.random());
        emptyTiles.get(index).value = Math.random() < 0.9 ? 2 : 4;
    }
}
