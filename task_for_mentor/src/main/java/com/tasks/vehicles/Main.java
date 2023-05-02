package com.tasks.vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Car("Skoda", "Disel", "cscs", 120.32);
        Vehicle motorbike2 = new Motorbike("Yamah", "Disel", "cs", 50.21);
        Vehicle motorbike3 = new Motorbike("Suzuki", "Disel", "cs", 50.21);
        VehicleWriter vehicleWriter = new VehicleWriter();
        vehicleWriter.writeVehicle(motorbike2);
    }
}
