package com.demo.bounce.model;

public class Bike extends Vehicle {
    private boolean isGearless;
    private boolean hasPowerStart;

    public Bike(String vehicleNumber, String model, String colour) {
        super(vehicleNumber, model, colour);
    }

    public boolean isGearless() {
        return isGearless;
    }

    public void setGearless(boolean gearless) {
        isGearless = gearless;
    }

    public boolean isHasPowerStart() {
        return hasPowerStart;
    }

    public void setHasPowerStart(boolean hasPowerStart) {
        this.hasPowerStart = hasPowerStart;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
