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

                if (chance(0.5, random)) {
                    // before placing we need to ensure that this place hasn't taken
                    initTiles.
                } else if (chance(0.10, random)) {

                } else if (chance(0.15, random)) {

                } else {

                }

                initTiles.add(tile);
            }
        }

        this.tiles = initTiles;
    }

    public void

    public void render() {
        // clear current console
    }

    public void tick() {
        // randomized actions
        //
    }

    public boolean chance(double probability, Random random) {
        return random.nextDouble() < probability;
    }
}
