package org.example.entities;

import java.util.Random;

public class Sheep extends Entity {
    int growthStage; // 1-3
    int energy; // for movement

    // boolean maybe add isChased or something?

    int targetX;
    int targetY;

    public Sheep(int x, int y, int energy) {
        super();
        this.x=x;
        this.y=y;
        this.energy = energy;

        this.targetX=-1;
        this.targetY=-1;
    }

    // TODO: SET TARGET, FIND TARGET, OR ESCAPE FROM PREDATOR
    public void setTarget() {

    }
}
