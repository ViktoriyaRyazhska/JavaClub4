import tasks.Task1;
import tasks.Task2;
import tasks.Task3;

public class Main {

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.execute(3);

        Task2 task2 = new Task2();
        task2.execute(10, 10);

        Task3 task3 = new Task3();
        task3.execute(5, 5, 5);

    }
}
