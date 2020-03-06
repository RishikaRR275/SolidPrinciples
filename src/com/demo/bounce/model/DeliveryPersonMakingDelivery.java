package com.demo.bounce.model;

import com.demo.bounce.implementation.Delivery;

public class DeliveryPersonMakingDelivery extends User implements Delivery {

    public DeliveryPersonMakingDelivery(String name, String contact) {
        super(name, contact);
    }

    @Override
    public void acceptRequest(Vehicle vehicle) {
        System.out.println("Accepted Request for delivery of "+vehicle.toString());
    }

    @Override
    public void deliverVehicle(Vehicle vehicle) {
        System.out.println("Delivering "+vehicle.toString());
    }

    @Override
    public void acceptPayment() {
        System.out.println("Accept Payment");
    }
}
