package com.tasks.vehicles;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class Motorbike implements Vehicle{

    private final String name;
    private final String engine;
    private final String performance;
    private final double powerAndTorque;
    private List<Motorbike> motorbikes = new ArrayList<>();

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
