package Main;

import Loops.Summation.Summation;
import String.Hello.Hello;

public class Main {
    public static void main(final String[] args) {
        //final Summation sum = new Summation(5);
        //System.out.println(sum.summation());

        final Hello hello = new Hello("Maksym Danyliuk", "Lanchyn", "Ivano-Frankivsk");
        System.out.println(hello.sayHello());
    }
}
