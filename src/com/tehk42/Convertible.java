package com.tehk42;

public class Convertible extends Car{

    private boolean roof;

    public Convertible(String name, int size, int doors, int gears, boolean isManual, boolean roof) {
        super(name, size,true, 4, doors, gears, isManual);
        this.roof = roof;
    }

    public void retractableRoof() {
        if(roof) {
            System.out.println("Convertible.retractableRoof(): Roof has been retracted");
        } else {
            System.out.println("Convertible.retractableRoof(): Roof has not been retracted");
        }
    }

    @Override
    public void move(int speed, int direction) {
        retractableRoof();
        if (!isManual()) {
            automaticAcceleration(speed, direction);
        } else {
            super.move(speed, direction);
        }

    }
}
