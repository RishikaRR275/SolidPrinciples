package com.demo.bounce.model;

import com.demo.bounce.implementation.Booking;

public class CustomerRequestingVehicle extends Customer implements Booking {
    public CustomerRequestingVehicle(String name, String contact) {
        super(name, contact);
    }

    @Override
    public void bookRide(Vehicle vehicle, CustomerRequestingVehicle customer) {
        System.out.println("Booking ride "+vehicle.toString()+" for "+customer.getName()+" successful");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment done");
    }
}
