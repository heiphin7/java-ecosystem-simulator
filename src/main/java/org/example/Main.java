package org.example;

import org.example.entities.World;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        // init world
        World world = new World(50, 20, random);

        // calculate amount of entities
        // randomize position of entities (with types)

        world.render();

//        boolean isRunning = true;
//
//        while (isRunning) {
//            // actions
//            // make a "tick" function that performs random actions with entities or grass
//            // render world into console
//            // thread.sleep (for better animation)
//
//            world.render();
//        }
    }
}