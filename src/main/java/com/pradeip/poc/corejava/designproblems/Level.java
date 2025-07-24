package com.pradeip.poc.corejava.designproblems;

public class Level {
    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0;

    public Level(int floor, int numberOfSpots) {
        this.floor = floor;
        spots = new ParkingSpot[numberOfSpots];
        int largeSpots = numberOfSpots / 4;
        int compactSpots = numberOfSpots / 4 * 3;
        int motorcycleSpots = numberOfSpots - largeSpots - compactSpots;

        for (int i = 0; i < numberOfSpots; i++) {
            VehicleSize size = i < motorcycleSpots ? VehicleSize.Motorcycle
                    : (i < motorcycleSpots + compactSpots ? VehicleSize.Compact : VehicleSize.Large);
            spots[i] = new ParkingSpot(this, floor, i, size);
        }
        availableSpots = numberOfSpots;
    }

    public boolean parkVehicle(Vehicle vehicle) {
        for (ParkingSpot spot : spots) {
            if (spot.canFitVehicle(vehicle)) {
                spot.park(vehicle);
                availableSpots--;
                return true;
            }
        }
        return false;
    }

    public void spotFreed() {
        availableSpots++;
    }

    public int getAvailableSpots() {
        return availableSpots;
    }
}
