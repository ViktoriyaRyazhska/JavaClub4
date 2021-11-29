package collections;
import java.util.List;
import java.util.Scanner;

public class Collections_Task_3 {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        for (int i = listOfNumbers.size()-1; i >= 0; i--)
        {
            if (listOfNumbers.get(i)%2 == 0)
            {
                listOfNumbers.remove(i);
            }
        }
        return listOfNumbers;
    }
    public static void solveTask(){

            System.out.println("This program calculates averages");
            Scanner input = new Scanner(System.in);
            System.out.println("Enter array length: ");
            int size ;
            while (!input.hasNextInt() || input.hasNext("(-[0-9]+)")) {
                System.out.println("Array size can only be positive integer number. Try again: ");
                input.next();
            }
            size = input.nextInt();
            int marks[] = new int[size];
            System.out.println("Insert array elements:");
            for (int i = 0; i < size; i++) {
                while (!input.hasNextInt()) {
                    System.out.println("That's not an integer, enter integer type:");
                    input.next();
                }
                marks[i] = input.nextInt();
            }
            System.out.print ("Inserted array elements:");
            for (int i = 0; i < size; i++) {
                System.out.print (" " + marks[i]);
            }
            System.out.println();
            System.out.println("Result: ");
            System.out.println("-----------");
            //System.out.println(getAverage(marks));
            System.out.println("-----------");

        }
    }

