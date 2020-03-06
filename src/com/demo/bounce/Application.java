package com.demo.bounce;

import com.demo.bounce.model.User;
import com.demo.bounce.model.UserHomePage;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        while(true){
            new UserHomePage().getUserLoginInfo();

        }
    }
}
