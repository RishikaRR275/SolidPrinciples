package com.demo.bounce.implementation;

import com.demo.bounce.model.CustomerRequestingVehicle;
import com.demo.bounce.model.Vehicle;

public interface Booking {
    public void bookRide(Vehicle vehicle, CustomerRequestingVehicle customer);

    public void makePayment();
}
