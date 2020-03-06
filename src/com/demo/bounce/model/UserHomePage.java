package com.demo.bounce.model;

import com.demo.bounce.implementation.License;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserHomePage implements License {

    public User getUserDetails() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Name : ");
        String name = br.readLine();
        System.out.println("Enter your Contact : ");
        String contact = br.readLine();
        return new User(name, contact);
    }

    public int getUserRole(){
        System.out.println("What are you? (Enter 1 or 2)\n 1. Customer \t 2. Delivery Person \n Please enter 3 to exit");
        int role = new Scanner(System.in).nextInt();
        return role;
    }

    public int getVehicleType(){
        System.out.println("What is your preferred mode of transport? (Enter 1 or 2)\n 1. Car \t 2. Bike \n Please enter 3 to exit");
        int role = new Scanner(System.in).nextInt();
        return role;
    }

    public void submitLicense(int vehicleType){
        String licenseSubmissionStatus = (vehicleType == 1)? "License for 2 wheeler submitted": "License for 4 wheeler submitted";
        System.out.println(licenseSubmissionStatus);
    }


    public void getUserLoginInfo() throws IOException {
        User user = this.getUserDetails();
        int role = this.getUserRole();
        int vehicleType= this.getVehicleType();
        submitLicense(vehicleType);
        new BounceDeterminer().goBouncing(vehicleType, user, role);
    }
}
