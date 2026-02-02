package org.example.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class World {
    int width;
    int length;
    Tile[][] tiles;
    int grassGrowthRate;
    int tickSpeed;

    public World(int width, int length, Random random) {
        Tile[][] initTiles = new Tile[length][width];
        this.width = width;
        this.length = length;


        // procedure map generation
        for (int i = length-1; i >= 0; i--) {
            for (int j = width-1; j >= 0; j--) {
                double roll = random.nextDouble();
                Tile tile = new Tile(i, j);
                int[] options = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; // options for enery for predator or sheeps

                if (roll < 0.05) {
                    // we don't need to ensure that there's not any other
                    tile.placePredator(i,j, options[random.nextInt(options.length)]);
                    tile.setAmount1();
                } else if (roll < 0.10) {
                    tile.placeSheep(i,j,options[random.nextInt(options.length)]);
                    tile.setAmount1();
                } else if (roll < 0.25) {
                    tile.setAmount3();
                } else if (roll < 0.50) {
                    tile.setAmount2();
                } else {
                    tile.setAmount1();
                }
                initTiles[i][j] = tile;
            }
        }

        this.tiles = initTiles;
    }

    public void render() {
        for (int i = 0; i < this.length; i++) {
            StringBuilder output = new StringBuilder();

            for (int j = 0; j < width; j++) {
                int finalI = i;
                int finalJ = j;

                Tile currTile = tiles[i][j];

                Entity currEntity = currTile.entities.stream()
                        .filter(e -> e.x == finalI && e.y == finalJ)
                        .findFirst()
                        .orElse(null);


                // System.out.println(currTile.getGrassAmount());

                if (currEntity != null) {
                    if (currEntity instanceof Predator) {
                        output.append("\uD83D\uDC3A");
                    } else { // no other cases than sheeps
                        output.append("\uD83D\uDC11");
                    }
                } else {
                    if (currTile.grassAmount == 1) {
                        output.append("\uD83C\uDF31");
                    } else if (currTile.grassAmount == 2) {
                        output.append("\uD83C\uDF3F");
                    } else { // == 3
                        output.append("\uD83C\uDF3E");
                    }
                }
            }
            System.out.println(output);
        }
    }

    public void tick() {
        // randomized actions
        //
    }

    public boolean chance(double probability, Random random) {
        return random.nextDouble() < probability;
    }
}
