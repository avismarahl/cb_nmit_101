package com.build.campus.vehicles; //UpperCamelCase for classes, camel case for variable method names, etc.,

import com.build.campus.components.Engine;

public class Car { //All the cars are automobiles also
    public String name;
    String color;
    String engineNumber;
    String modelNumber;
    String registrationNumber;
    public Engine engine = new Engine(this);

    public void start() {
        this.engine.start();
    }

    public void brake() {

    }

    public void accelerate(Double degree) {

    }

    public void respondToLeak() {
        System.out.println("Show red icon on the dashboard on " + this);
    }
}




//is - a relationship
//has - a relationship