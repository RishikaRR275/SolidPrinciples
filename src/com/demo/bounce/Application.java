package com.demo.bounce;

import com.demo.bounce.model.VehicleBooking;
import com.demo.bounce.model.VehicleDelivery;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Please enter your name and contact \n Name: ");
            String name = br.readLine();
            System.out.println("Contact: ");
            String contact = br.readLine();
            System.out.println("What are you? (Enter 1 or 2)\n 1. Customer \t 2. Delivery Person \n Please enter 3 to exit");
            int role = Integer.parseInt(br.readLine());
            if(role == 3) {
                System.out.println("Have a great day!");
                System.exit(0);
            }
            System.out.println("Please select your preferred mode of transport?(Enter 1 or 2)\n 1. Car \t 2. Bike \n Please enter 3 to exit");
            int vehicleType = Integer.parseInt(br.readLine());
            if(vehicleType == 3) {
                System.out.println("Have a great day!");
                System.exit(0);
            }

            if(role == 1)
                new VehicleBooking(vehicleType, name, contact).booking();

            if(role == 2)
                new VehicleDelivery(vehicleType, name, contact).delivery();
        }
    }
}
