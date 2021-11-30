package tasks.oop.adamAndEve;

public class God {

    public static Human[] create() {

        System.out.println("All two objects are instances of Human class");

        return new Human[]{new Man(), new Woman()};
    }
}
