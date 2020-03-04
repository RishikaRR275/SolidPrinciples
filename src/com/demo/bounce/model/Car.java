package com.demo.bounce.model;

public class Car extends Vehicle{
    private boolean hasAirbag;
    private boolean isAutomatic;

    public Car(String vehicleNumber, String model, String colour) {
        super(vehicleNumber, model, colour);
    }

    public boolean isHasAirbag() {
        return hasAirbag;
    }

    public void setHasAirbag(boolean hasAirbag) {
        this.hasAirbag = hasAirbag;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }
}
