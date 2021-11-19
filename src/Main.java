import java.util.Scanner;

import tasks.basic.DoubleInteger;
import tasks.basic.MultiplicationOfTwoNums;
import tasks.basic.VolOfCuboid;
import tasks.classes.*;


public class Main {

    public static void main(String[] args) {


        System.out.println("Please enter a number of part you want to run:");
        System.out.println("1 ---- Basic-part");
        System.out.println("2 ---- Classes-part");
        System.out.println("3 ---- Collections-part");
        System.out.println("4 ---- Conditions-part");
        System.out.println("5 ---- Loops-part");
        System.out.println("6 ---- OOP-part");
        System.out.println("7 ---- String-part");
        System.out.println("Please select number of part: ");

        Scanner scanner = new Scanner(System.in);
        int numOfPart = scanner.nextInt();

        switch (numOfPart) {
            case 1 -> {
                System.out.println("You selected BASIC part: ");
                System.out.println("Please enter a number of task you want to run:");
                System.out.println("1 ---- Double-Integer");
                System.out.println("2 ---- Multiplying-Two-Numbers");
                System.out.println("3 ---- Volume-Of-Cuboid");
                System.out.println("7 ---- Time-After-Midnight");
                System.out.println("====================================");
                System.out.println("Please select number of task: ");

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

                    case 4 -> {}

                    case 5 -> {}

                    case 6 -> {}

                    case 7 -> {}
                }

            }
            case 2 -> {
                System.out.println("You selected CLASS part: ");
                System.out.println("Please enter a number of task you want to run:");
                System.out.println("1 ---- Double-Integer");
                System.out.println("2 ---- Multiplying-Two-Numbers");
                System.out.println("3 ---- Volume-Of-Cuboid");
                System.out.println("7 ---- Time-After-Midnight");
                System.out.println("====================================");
                System.out.println("Please select number of task: ");

                int numOfTaskClassPart = scanner.nextInt();

                switch (numOfTaskClassPart) {

                    case 1 -> {
                        // TODO: 20.11.2021
                    }

                    case 2 -> {
                        System.out.println("Please enter a number to add 100 to it: ");
                        int num = scanner.nextInt();
                        AdditionOf100ToNum additionOf100ToNum = new AdditionOf100ToNum();
                        additionOf100ToNum.execute(num);


                    }

                    case 3 -> {}

                    case 4 -> {}

                    case 5 -> {}

                    case 6 -> {}

                    case 7 -> {}
                }
            }
            case 3 -> {
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

                    case 3 -> {}

                    case 4 -> {}

                    case 5 -> {}

                    case 6 -> {}

                    case 7 -> {}
                }
            }
            case 4 -> {
                System.out.println("You selected CONDITION part: ");
                System.out.println("Please enter a number of task you want to run:");
                System.out.println("1 ---- Double-Integer");
                System.out.println("2 ---- Multiplying-Two-Numbers");
                System.out.println("3 ---- Volume-Of-Cuboid");
                System.out.println("7 ---- Time-After-Midnight");
                System.out.println("====================================");
                System.out.println("Please select number of task: ");

                int numOfTaskConditionPart = scanner.nextInt();

                switch (numOfTaskConditionPart) {

                    case 1 -> {
                        // TODO: 20.11.2021
                    }

                    case 2 -> {
                        System.out.println("Please enter a number to add 100 to it: ");
                        int num = scanner.nextInt();
                        AdditionOf100ToNum additionOf100ToNum = new AdditionOf100ToNum();
                        additionOf100ToNum.execute(num);
                    }

                    case 3 -> {}

                    case 4 -> {}

                    case 5 -> {}

                    case 6 -> {}

                    case 7 -> {}
                }
            }

            case 5 -> {
                System.out.println("You selected LOOP part: ");
                System.out.println("Please enter a number of task you want to run:");
                System.out.println("1 ---- Double-Integer");
                System.out.println("2 ---- Multiplying-Two-Numbers");
                System.out.println("3 ---- Volume-Of-Cuboid");
                System.out.println("7 ---- Time-After-Midnight");
                System.out.println("====================================");
                System.out.println("Please select number of task: ");

                int numOfTaskLoopPart = scanner.nextInt();

                switch (numOfTaskLoopPart) {

                    case 1 -> {
                        // TODO: 20.11.2021
                    }

                    case 2 -> {
                        System.out.println("Please enter a number to add 100 to it: ");
                        int num = scanner.nextInt();
                        AdditionOf100ToNum additionOf100ToNum = new AdditionOf100ToNum();
                        additionOf100ToNum.execute(num);


                    }

                    case 3 -> {}

                    case 4 -> {}

                    case 5 -> {}

                    case 6 -> {}

                    case 7 -> {}
                }
            }

            case 6 -> {
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

                    case 3 -> {}

                    case 4 -> {}

                    case 5 -> {}

                    case 6 -> {}

                    case 7 -> {}
                }
            }

            case 7 -> {
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

                    case 3 -> {}

                    case 4 -> {}

                    case 5 -> {}

                    case 6 -> {}

                    case 7 -> {}
                }
            }
        }
    }
}
