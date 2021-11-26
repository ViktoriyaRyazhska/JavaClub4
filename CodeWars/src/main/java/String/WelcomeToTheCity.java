package com.company1;

import java.util.Formatter;

public class WelcomeToTheCity {
    public String sayHello(String [] name, String city, String state){
        String temp = "Hello, %s! Welcome to %s, %s!";
        return new Formatter().format(temp, String.join(" ", name), city, state).toString();
    }
}
