package com.demo.bounce.model;

public class BounceDeterminer {

    public void goBouncing(int vehicleType, User user, int role) {
        if(role == 1){
            new VehicleBooking(vehicleType, user.getName(), user.getContact()).booking();
        }
        if(role == 2) {
            new VehicleDelivery(vehicleType, user.getName(), user.getContact()).delivery();
        }
    }
}
