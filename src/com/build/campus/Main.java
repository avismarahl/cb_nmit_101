package com.build.campus;

import com.build.campus.vehicles.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        car.start();
        car.engine.leakDetected();
    }
}