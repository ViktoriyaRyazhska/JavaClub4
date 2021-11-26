package oop;

import java.util.Scanner;

public class OOP_Task_1 {
    public static Human[] create(){
        return new Human[]{new Man(), new Woman()};
    }

    public static void solveTask(){
        System.out.println("Hello! This tasks represents an theoretical part of programming which is also very important" +
                "In this task we will learn how to extend classes.\n" +
                "It's called inheritance. It is the ability to acquire the properties of existing classes and create new ones.\n" +
                "Here we have code which demonstrates correct inheritance principle usage:\n" +
                "public class God {\n" +
                "    public static Human[] create(){\n" +
                "        return new Human[]{new Man(), new Woman()};\n" +
                "    }" +
                "}\n" +
                "}\n" +
                "class Human{\n" +
                "}\n" +
                "class Man extends Human{\n" +
                "}\n" +
                "class Woman extends Human{\n" +
                "}\n" +
                "We can see that we have Human class which is a parent class\n" +
                "Then we've created two another class which are children of Human class." +
                "We can also create methods in Human class and it will be visible in children classes as well\n" +
                "This method can be implemented by different ways in Man and Woman classes\n" +
                "The most important this is that this methods must be in parent class!\n" +
                "Also there is method in God class which returns an array of instances of Human class\n" +
                "As we see there is one instance of Man class and another of Woman class\n");

    }
}
class Human{
}
class Man extends Human{
}
class Woman extends Human{
}