package com.demo.bounce.model;

import com.demo.bounce.implementation.Delivery;
import com.demo.bounce.implementation.License;
import com.demo.bounce.service.DeliveryServices;

import java.util.ArrayList;
import java.util.List;

public  class DeliveryPerson extends Person implements  License {
    public DeliveryPerson(String name, String contact) {
        super(name, contact);
    }
    @Override
    public  void submitLicense(Vehicle vehicle){
        DeliveryServices deliveryServices = new DeliveryServices();
        if(vehicle instanceof Bike)
            deliveryServices.submit2WheelerLicense();
        else {
            deliveryServices.submit4WheelerLicense();
        }

    }
}
