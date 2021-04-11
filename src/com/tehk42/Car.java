package com.tehk42;

public class Car extends Vehicle{
    private boolean engine;
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;

    public Car(String name, int size, boolean engine, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void gearSystem(int currentGear) {
        System.out.println("Car.gearSystem() called.");
        if(currentGear > this.gears) {
            System.out.println("Maximum value is " + this.gears);
        }
        this.currentGear = currentGear;
        System.out.println("Car.gearSystem(): Car is set to gear #" + currentGear);
    }


    public void carMovement(int speed, int direction) {
        System.out.println("Car.carMovement() called.");
        super.move(speed, direction);
    }

    public boolean isManual() {
        return isManual;
    }

    public void automaticAcceleration(int rate, int direction) {
        System.out.println("Car.automaticAcceleration called.");
        int newVelocity = getCurrentVelocity() + rate;
        if(newVelocity == 0) {
            stop();
            gearSystem(1);
        } else if(newVelocity > 0 && newVelocity <= 10) {
            gearSystem(1);
        } else if(newVelocity > 10 && newVelocity <= 20) {
            gearSystem(2);
        } else if(newVelocity > 20 && newVelocity <= 30) {
            gearSystem(3);
        } else if(newVelocity > 30 && newVelocity <= 40) {
            gearSystem(4);
        } else {
            gearSystem(5);
        }

        if(newVelocity > 0) {
            carMovement(newVelocity, direction);
        }
    }
}
