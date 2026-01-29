package org.example.entities;

abstract class Entity {
    int x, y;

    public Entity() {
        // just to not be null
        this.x=0;
        this.y=0;
    }
}
