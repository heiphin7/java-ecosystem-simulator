package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    int grassAmount;
    int x,y;
    List<Entity> entities;

    public Tile(int x, int y) {
        this.x=x;
        this.y=y;


    }

    public void placeSheep() {
        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }

        entities.add()
    }

    public void placePredator(int x, int y) {
        Predator predator = new Predator(x,y);

        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }

        entities.add(predator);
    }
}
