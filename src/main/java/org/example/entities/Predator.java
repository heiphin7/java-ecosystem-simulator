package org.example.entities;

public class Predator extends Entity {
    int energy;
    int targetX;
    int targetY;

    public Predator(int x, int y, int energy) {
        super();
        this.x=x;
        this.y=y;
        this.energy = energy;

        this.targetX=-1;
        this.targetY=-1;
    }

    public void setTarget(int x, int y) {
        this.targetX = x;
        this.targetY = y;
    }

    public boolean hasTarget() {
        if (targetX == -1 || targetY == -1) {
            return false;
        }

        return true;
    }
}
