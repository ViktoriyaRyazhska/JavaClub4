import java.util.Scanner;

import tasks.basic.*;
import tasks.classes.*;
import tasks.conditions.*;
import tasks.loops.StringRepeat;


public class Main {

    Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {


        Main main = new Main();

        System.out.println("Please enter a number of part you want to run:");
        System.out.println("1 ---- Basic-part");
        System.out.println("2 ---- Classes-part");
        System.out.println("3 ---- Collections-part");
        System.out.println("4 ---- Conditions-part");
        System.out.println("5 ---- Loops-part");
        System.out.println("6 ---- OOP-part");
        System.out.println("7 ---- String-part");
        System.out.println("Please select number of part: ");
        int numOfPart = main.scanner.nextInt();


        switch (numOfPart) {
            case 1 -> {

                main.runBasicPart();
            }

            case 2 -> {

                main.runClassPart();
            }

            case 3 -> {

                main.runCollectionPart();
            }

            case 4 -> {

                main.runConditionPart();
            }

            case 5 -> {

                main.runLoopPart();
            }

            case 6 -> {

                main.runOopPart();
            }

            case 7 -> {

                main.runStringPart();
            }
        }
    }

    private void runBasicPart() {

        System.out.println("You selected BASIC part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Double-Integer");
        System.out.println("2 ---- Multiplying-Two-Numbers");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("4 ---- Is wallLength divisible");
        System.out.println("5 ---- Greet");
        System.out.println("6 ---- Number in a binary format");
        System.out.println("7 ---- Time-After-Midnight");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");
        Scanner scanner = new Scanner(System.in);
        int numOfTaskBasicPart = scanner.nextInt();

        switch (numOfTaskBasicPart) {

            case 1 -> {
                System.out.println("Please enter number to double it: ");
                int numToDouble = scanner.nextInt();
                DoubleInteger doubleInteger = new DoubleInteger();
                doubleInteger.execute(numToDouble);
            }

            case 2 -> {
                System.out.println("Please enter two numbers to multiply them: ");
                int firstNum = scanner.nextInt();
                int secondNum = scanner.nextInt();
                MultiplicationOfTwoNums multiplicationOfTwoNums = new MultiplicationOfTwoNums();
                multiplicationOfTwoNums.execute(firstNum, secondNum);
            }

            case 3 -> {
                System.out.println("Please enter length, width and height to get volume of cuboid: ");
                int length = scanner.nextInt();
                int width = scanner.nextInt();
                int height = scanner.nextInt();
                VolOfCuboid volOfCuboid = new VolOfCuboid();
                volOfCuboid.execute(length, width, height);
            }

            case 4 -> {
                System.out.println("Please enter wallLength and pixel size to know if wallLength is divisible: ");
                int wallLength = scanner.nextInt();
                int pixelSize = scanner.nextInt();
                IsDivisible isDivisible = new IsDivisible();
                isDivisible.execute(wallLength, pixelSize);
            }

            case 5 -> {
                System.out.println("Please enter your name: ");
                String name = scanner.next();
                Greet greet = new Greet();
                greet.execute(name);
            }

            case 6 -> {
                System.out.println("Please enter number to convert to binary format: ");
                int number = scanner.nextInt();
                IntegerToBinary integerToBinary = new IntegerToBinary();
                integerToBinary.execute(number);
            }

            case 7 -> {
            }
        }

    }

    private void runClassPart() {

        System.out.println("You selected CLASS part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Encapsulation Test");
        System.out.println("2 ---- Addition of a 100 number to yours");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("7 ---- Time-After-Midnight");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        Scanner scanner = new Scanner(System.in);
        int numOfTaskClassPart = scanner.nextInt();

        switch (numOfTaskClassPart) {

            case 1 -> {
                System.out.println("Run! It is just encapsulation test... Result must be zero: ");
                Encapsulation encapsulation = new Encapsulation();
                encapsulation.execute();
            }

            case 2 -> {
                System.out.println("Please enter a number to add 100 to it: ");
                int num = scanner.nextInt();
                AdditionOf100ToNum additionOf100ToNum = new AdditionOf100ToNum();
                additionOf100ToNum.execute(num);


            }

            case 3 -> {

                // TODO: 20.11.2021
            }

            case 4 -> {
            }

            case 5 -> {
            }

            case 6 -> {
            }

            case 7 -> {
            }
        }
    }

    private void runCollectionPart() {

        System.out.println("You selected COLLECTION part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Double-Integer");
        System.out.println("2 ---- Multiplying-Two-Numbers");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("7 ---- Time-After-Midnight");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        int numOfTaskCollectionPart = scanner.nextInt();

        switch (numOfTaskCollectionPart) {

            case 1 -> {
                // TODO: 20.11.2021
            }

            case 2 -> {
                System.out.println("Please enter a number to add 100 to it: ");
                int num = scanner.nextInt();
                AdditionOf100ToNum additionOf100ToNum = new AdditionOf100ToNum();
                additionOf100ToNum.execute(num);


            }

            case 3 -> {
            }

            case 4 -> {
            }

            case 5 -> {
            }

            case 6 -> {
            }

            case 7 -> {
            }
        }
    }

    private void runConditionPart() {

        System.out.println("You selected CONDITION part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Opposite-Number");
        System.out.println("2 ---- Is-Divisible-By-Two-Numbers");
        System.out.println("3 ---- Boolean-To-String");
        System.out.println("4 ---- Get-Bonus");
        System.out.println("5 ---- Year-Of-Birth");
        System.out.println("7 ---- Basic-mathematical-operations");
        System.out.println("8 ---- Opposites-attract");
        System.out.println("9 ---- YesOrNo");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        int numOfTaskConditionPart = scanner.nextInt();

        switch (numOfTaskConditionPart) {

            case 1 -> {
                System.out.println("Please enter a number to see opposite of it: ");
                int num = scanner.nextInt();
                OppositeNumber oppositeNumber = new OppositeNumber();
                oppositeNumber.execute(num);
            }

            case 2 -> {
                System.out.println("Please enter n, x and y to check if n can be divided by x and y: ");
                int n = scanner.nextInt();
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                IsDivisibleByTwoNums isDivisibleByTwoNums = new IsDivisibleByTwoNums();
                isDivisibleByTwoNums.execute(n, x, y);
            }

            case 3 -> {
                System.out.println("Please enter true or false to check boolean: ");
                boolean b = scanner.nextBoolean();
                BooleanToString booleanToString = new BooleanToString();
                booleanToString.execute(b);
            }

            case 4 -> {
                System.out.println("Please enter your salary and true or false: ");
                int salary = scanner.nextInt();
                boolean bool = scanner.nextBoolean();
                GetBonus getBonus = new GetBonus();
                getBonus.execute(salary, bool);
            }

            case 5 -> {
                System.out.println("Please enter your year of birth and year you want to know you were: ");
                int birth = scanner.nextInt();
                int yearTo = scanner.nextInt();
                YearOfBirth yearOfBirth = new YearOfBirth();
                yearOfBirth.execute(birth, yearTo);
            }

            case 6 -> {
            }

            case 7 -> {
                System.out.println("Please enter operation and two numbers: ");
                String op = scanner.next();
                int v1 = scanner.nextInt();
                int v2 = scanner.nextInt();
                BasicOperations basicOperations = new BasicOperations();
                basicOperations.execute(op, v1, v2);
            }
            case 8 -> {
                System.out.println("Please enter two numbers: ");
                int flower1 = scanner.nextInt();
                int flower2 = scanner.nextInt();
                OppositesAttract oppositesAttract = new OppositesAttract();
                oppositesAttract.execute(flower1, flower2);
            }
            case 9 -> {
                System.out.println("Please enter true or false to convert boolean:");
                boolean b = scanner.nextBoolean();
                YesOrNo yesOrNo  = new YesOrNo();
                yesOrNo.execute(b);
            }
        }
    }

    private void runLoopPart() {

        System.out.println("You selected LOOP part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Repeat-String");
        System.out.println("2 ---- Multiplying-Two-Numbers");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("7 ---- Time-After-Midnight");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        int numOfTaskLoopPart = scanner.nextInt();

        switch (numOfTaskLoopPart) {

            case 1 -> {
                System.out.println("Please enter a number to of time to repeat and a string to repeat it: ");
                int repeat = scanner.nextInt();
                String s = scanner.next();
                StringRepeat stringRepeat = new StringRepeat();
                stringRepeat.execute(repeat, s);
            }

            case 2 -> {
                System.out.println("Please enter a number to add 100 to it: ");
                int num = scanner.nextInt();
                AdditionOf100ToNum additionOf100ToNum = new AdditionOf100ToNum();
                additionOf100ToNum.execute(num);


            }

            case 3 -> {
            }

            case 4 -> {
            }

            case 5 -> {
            }

            case 6 -> {
            }

            case 7 -> {
            }
        }
    }

    private void runOopPart() {

        System.out.println("You selected OOP part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Double-Integer");
        System.out.println("2 ---- Multiplying-Two-Numbers");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("7 ---- Time-After-Midnight");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        int numOfTaskOopPart = scanner.nextInt();

        switch (numOfTaskOopPart) {

            case 1 -> {
                // TODO: 20.11.2021
            }

            case 2 -> {
                System.out.println("Please enter a number to add 100 to it: ");
                int num = scanner.nextInt();
                AdditionOf100ToNum additionOf100ToNum = new AdditionOf100ToNum();
                additionOf100ToNum.execute(num);


            }

            case 3 -> {
            }

            case 4 -> {
            }

            case 5 -> {
            }

            case 6 -> {
            }

            case 7 -> {
            }
        }
    }

    private void runStringPart() {

        System.out.println("You selected STRING part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Double-Integer");
        System.out.println("2 ---- Multiplying-Two-Numbers");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("7 ---- Time-After-Midnight");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        int numOfTaskStringPart = scanner.nextInt();

        switch (numOfTaskStringPart) {

            case 1 -> {
                // TODO: 20.11.2021
            }

            case 2 -> {
                System.out.println("Please enter a number to add 100 to it: ");
                int num = scanner.nextInt();
                AdditionOf100ToNum additionOf100ToNum = new AdditionOf100ToNum();
                additionOf100ToNum.execute(num);


            }

            case 3 -> {
            }

            case 4 -> {
            }

            case 5 -> {
            }

            case 6 -> {
            }

            case 7 -> {
            }
        }
    }
}
