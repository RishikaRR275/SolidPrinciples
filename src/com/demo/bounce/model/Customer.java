package com.demo.bounce.model;

import com.demo.bounce.implementation.Booking;


public abstract class Customer extends Person implements Booking {
    public Customer(String name, String contact) {
        super(name, contact);
    }


}
