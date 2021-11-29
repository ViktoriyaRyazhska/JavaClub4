package tasks.oop;

import java.util.Arrays;

public class AdamAndEve {

    private static Human[] create() {

        System.out.println("All two objects are instances of Human class");

        return new Human[]{new Man(), new Woman()};
    }

    public void execute() {
        System.out.println(Arrays.toString(create()));
    }
}

class Human {
}

class Man extends Human {
    @Override
    public String toString() {
        return "Man{}";
    }
}

class Woman extends Human {
    @Override
    public String toString() {
        return "Woman{}";
    }
}