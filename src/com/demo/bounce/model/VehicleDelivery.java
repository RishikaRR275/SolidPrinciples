package com.demo.bounce.model;

public class VehicleDelivery {
    private int vehicleType;
    private String name;
    private String contact;

    public VehicleDelivery(int vehicleType, String name, String contact) {
        this.vehicleType = vehicleType;
        this.name = name;
        this.contact = contact;
    }

    public void delivery(){
        DeliveryPersonMakingDelivery deliveryPerson = new DeliveryPersonMakingDelivery(this.name, this.contact);
        Vehicle vehicle;
        int vehicleType = this.vehicleType;
        vehicle =  (vehicleType == 1)?new Car("AR 1927", "creta", "white"): new Bike("RA 2719", "continental gt", "silver");
        deliveryPerson.acceptRequest(vehicle);
        deliveryPerson.deliverVehicle(vehicle);
        deliveryPerson.acceptPayment();
    }
}
