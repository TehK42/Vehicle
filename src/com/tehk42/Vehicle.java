package com.tehk42;

public class Vehicle {
    private String name;
    private int size;
    private int direction;
    private int currentVelocity;


    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.direction = 0;
        this.currentVelocity = 0;
    }

    public void movingDirection(int direction) {
        System.out.println("Vehicle.movingDirection() called.");
        this.direction = direction;
        switch(direction) {
            case 1:
                System.out.println("Vehicle is moving left");
                break;
            case 2:
                System.out.println("Vehicle is moving forward");
                break;
            case 3:
                System.out.println("Vehicle is moving right");
                break;
            case 4:
                System.out.println("Vehicle is reversing");
                break;
            default:
                System.out.println("Invalid direction. Choose between 1(left), 2(forward), 3(right), 4(back)");
        }
    }

    public void steering(int direction) {
        movingDirection(direction);
        if (direction != 2) {
            System.out.println("Vehicle.steering(): The vehicle is steering");
            if (size > 5) {
                System.out.println("The vehicle is steering harder");
            }
        } else {
            System.out.println("Vehicle.steering(): The vehicle is being steered steadily");
        }
    }

    public void move(int speed, int direction) {
        currentVelocity += speed;
        steering(direction);
        System.out.println("Vehicle.move(): The vehicle is moving at " + currentVelocity);
    }

    public void stop() {
        System.out.println("Vehicle.stop(): The vehicle has stopped.");
        this.currentVelocity = 0;
    }

    public int getSize() {
        return size;
    }

    public int getDirection() {
        return direction;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public String getName() {
        return name;
    }
}
