package com.basicjava.abstractexample;

abstract class MotorBike {

    private int motorCode;

    abstract void brake();

    public void run() {
        System.out.println("It is just a motor bike running.");
        this.motorCode=10;
        System.out.println("Motor code: "+ this.motorCode);
    }
}
