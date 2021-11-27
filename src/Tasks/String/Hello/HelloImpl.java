package Tasks.String.Hello;

import java.util.Scanner;

public class HelloImpl implements Hello {
    private String name;
    private String city;
    private String state;

    public HelloImpl(final Scanner scanner) {
        setName(scanner.nextLine());
        setCity(scanner.nextLine());
        setState(scanner.nextLine());
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if (!name.isEmpty() && name.matches("(\\b([A-Z][a-z]*)\\b)*")) {
            this.name = name;
        } else {
            this.name = "John";
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(final String city) {
        if (!city.isEmpty() && city.matches("\\b([A-Z][a-z]*)\\b")) {
            this.city = city;
        } else {
            this.city = "Phoenix";
        }
    }

    public String getState() {
        return state;
    }

    public void setState(final String state) {
        if (!state.isEmpty() && state.matches("\\b([A-Z][a-z]*)\\b")) {
            this.state = state;
        } else {
            this.state = "Arizona";
        }
    }

    @Override
    public String sayHello(){
        String hello = "";
        hello = hello.concat("Hello, " + getName() + "!" + " Welcome to " + getCity() + ", " + getState() + "!");;
        return hello;
    }
}