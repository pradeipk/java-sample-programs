package com.pradeip.poc.corejava.designproblems;

public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level level, int row, int spotNumber, VehicleSize spotSize) {
        this.level = level;
        this.row = row;
        this.spotNumber = spotNumber;
        this.spotSize = spotSize;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable() && vehicle.getSize().ordinal() <= spotSize.ordinal();
    }

    public boolean park(Vehicle vehicle) {
        if (!canFitVehicle(vehicle)) {
            return false;
        }
        this.vehicle = vehicle;
        return true;
    }

    public void removeVehicle() {
        this.vehicle = null;
        level.spotFreed();
    }

    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }
}
