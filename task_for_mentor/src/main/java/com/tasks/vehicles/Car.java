package com.tasks.vehicles;



public class Car implements Vehicle{

    private final String name;
    private final String engine;
    private final String performance;
    private final double powerAndTorque;

    public Car(String name, String engine, String performance, double powerAndTorque) {
        this.name = name;
        this.engine = engine;
        this.performance = performance;
        this.powerAndTorque = powerAndTorque;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getPerformance() {
        return performance;
    }

    @Override
    public double getPowerAndTorque() {
        return powerAndTorque;
    }


}
