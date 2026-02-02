package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Tile {
    int grassAmount; // 1,2,3
    int x,y;
    List<Entity> entities;

    public Tile(int x, int y) {
        this.x=x;
        this.y=y;
        this.entities=new ArrayList<>();
    }

    public void placeSheep(int x, int y, int energy) {
        Sheep sheep = new Sheep(x,y,energy);

        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }

        entities.add(sheep);
    }

    public void placePredator(int x, int y, int energy) {
        Predator predator = new Predator(x,y,energy);

        if (this.entities == null) {
            this.entities = new ArrayList<>();
        }

        entities.add(predator);
    }

    public void setAmount1() { this.grassAmount=1; }
    public void setAmount2() { this.grassAmount=2; }
    public void setAmount3() { this.grassAmount=3; }

    public List<?> getEntities() {
        return this.entities;
    }

    public Integer getGrassAmount() {
        return this.grassAmount;
    }
}
