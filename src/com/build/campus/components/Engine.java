package com.build.campus.components;

import com.build.campus.vehicles.Car;

public class Engine {
    Car car;
    public Engine(Car car) {
        System.out.println("Assigning this.car to car. This means that the reference of the Car inside the engine is set.");
        this.car = car;
    }

    public void start() {
        System.out.println("The engine has started");
    }

    public void leakDetected() {
        System.out.println(this.car);
        car.respondToLeak();
    }
}
