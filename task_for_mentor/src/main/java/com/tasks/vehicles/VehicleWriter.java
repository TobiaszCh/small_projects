package com.tasks.vehicles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class VehicleWriter {
    private static final String CAR = "C:/Projects/small_projects/task_for_mentor/src/main/java/com/tasks/vehicles/files/Car";
    private static final String MOTORBIKE = "C:/Projects/small_projects/task_for_mentor/src/main/java/com/tasks/vehicles/files/Motorbike";
    public void writeVehicle(Vehicle vehicle) {
        File pathCar = Path.of("").toFile();
        if(vehicle instanceof Car) {
            pathCar = Path.of(CAR).toFile();
        } else if (vehicle instanceof Motorbike) {
            pathCar = Path.of(MOTORBIKE).toFile();
        }
        try {
            FileWriter fileWriter = new FileWriter(pathCar, true);
            fileWriter.write(vehicle.getName() + ", " + vehicle.getEngine() + ", " +
                    vehicle.getPerformance() + ", " + vehicle.getPowerAndTorque() + "\n");
            fileWriter.close();
        }
        catch (IOException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
