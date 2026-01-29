package org.example.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    int width;
    int length;
    List<Tile> tiles;
    int grassGrowthRate;
    int tickSpeed;

    public World(int width, int length, Random random) {
        List<Tile> initTiles = new ArrayList<>();
        this.width = width;
        this.length = length;

        // procedure map generation
        for (int i = width; i > 0; i--) {
            for (int j = length; j > 0; j--) {
                Tile tile = new Tile(i, j);

                // randomly level of grass and

                initTiles.add(tile);
            }
        }

        this.tiles = initTiles;
    }

    public void render() {
        // clear current console
    }

    public void tick() {
        // randomized actions
        //
    }
}
