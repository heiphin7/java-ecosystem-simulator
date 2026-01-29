package org.example.entities;

abstract class Entity {
    int x, y; // position
    int energy;
    int age;

    abstract void tick(World world);
}
