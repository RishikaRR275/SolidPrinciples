package com.demo.bounce.model;

public class VehicleBooking {
    private int vehicleType;
    private String name;
    private String contact;

    public VehicleBooking(int vehicleType, String name, String contact) {
        this.vehicleType = vehicleType;
        this.name = name;
        this.contact = contact;
    }

    public void booking(){
        CustomerRequestingVehicle customer = new CustomerRequestingVehicle(this.name, this.contact);
        Vehicle vehicle;
        int vehicleType = this.vehicleType;
        vehicle =  (vehicleType == 1)?new Car("AR 1927", "creta", "white"): new Bike("RA 2719", "continental gt", "silver");
        customer.bookRide(vehicle,customer);
        customer.makePayment();

    }
}
