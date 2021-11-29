package tasks.string;

import java.util.Arrays;

public class WelcomeToCity {

    private String sayHello(String[] name, String city, String state){

        String formatedName = Arrays.toString(name)
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
                .trim();

        return String.format("Hello %s! Welcome to %s, %s!", formatedName, city, state);
    }


    public void execute(String[] name, String city, String state){

        System.out.println(sayHello(name, city, state));
    }
}
