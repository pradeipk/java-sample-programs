package com.pradeip.poc.corejava.designproblems;

public class ParkingLot {
    private Level[] levels;

    public ParkingLot(int numberOfLevels, int spotsPerLevel) {
        levels = new Level[numberOfLevels];
        for (int i = 0; i < numberOfLevels; i++) {
            levels[i] = new Level(i, spotsPerLevel);
        }
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (Level level : levels) {
            if (level.parkVehicle(vehicle)) {
                return true;
            }
        }
        return false;
    }
}
