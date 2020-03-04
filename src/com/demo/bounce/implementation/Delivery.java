package com.demo.bounce.implementation;

import com.demo.bounce.model.Vehicle;

public interface Delivery {
    public void acceptRequest(Vehicle vehicle);
    public void deliverVehicle(Vehicle vehicle);
    public void acceptPayment();
}
