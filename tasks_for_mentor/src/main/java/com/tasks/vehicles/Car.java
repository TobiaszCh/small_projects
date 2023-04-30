package com.tasks.vehicles;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Car implements Vehicle{

    private final String name;
    private final String engine;
    private final String performance;
    private final double powerAndTorque;


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
