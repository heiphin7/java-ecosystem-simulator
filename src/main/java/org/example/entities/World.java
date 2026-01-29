package org.example.entities;

import java.util.List;
import java.util.Random;

public class World {
    int width;
    int length;
    List<Tile> tiles;
    int grassGrowthRate;
    int tickSpeed;
    Random random;

    public World(int width, int length) {
        this.width = width;
        this.length = length;

        // procedure map generation
    }

    public void render() {
        // clear current console
    }

    public void tick() {
        // randomized actions
        //
    }
}
