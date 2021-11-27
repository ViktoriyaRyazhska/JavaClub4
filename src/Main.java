import java.util.Scanner;

import tasks.basic.*;
import tasks.classes.*;
import tasks.conditions.*;
import tasks.conditions.OppositeNumber;
import tasks.loops.*;
import tasks.oop.AdamAndEve;
import tasks.string.*;
import tasks.сollections.PushObjectIntoArray;
import tasks.сollections.UnfinishedLoop;


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
        System.out.println("8 ---- Century-From-Year");
        System.out.println("9 ---- Return-Negative");
        System.out.println("10 ---- Age-Range-Compatibility");
        System.out.println("11 ---- Grasshopper-Debug");
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

            case 8 -> {
            }

            case 9 -> {
            }

            case 10 -> {

                System.out.println("Please enter your age to see compatibility: ");
                int number = scanner.nextInt();
                AgeRangeCompatibility ageRangeCompatibility = new AgeRangeCompatibility();
                ageRangeCompatibility.execute(number);
            }

            case 11 -> {
                System.out.println("Please enter your temperature in fahrenheit to see in celsius: ");
                int number = scanner.nextInt();
                Grasshopper grasshopper = new Grasshopper();
                grasshopper.execute(number);
            }
        }

    }

    private void runClassPart() {

        System.out.println("You selected CLASS part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Encapsulation Test");
        System.out.println("2 ---- Addition of a 100 number to yours");
        System.out.println("3 ---- Add-Two-Fractions");
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
                System.out.println("Please enter two fracions to add them: ");
                long top1 = scanner.nextInt();
                long bot1 = scanner.nextInt();
                long top2 = scanner.nextInt();
                long bot2 = scanner.nextInt();
                Fraction fraction = new Fraction(top1, bot1);
                Fraction fraction2 = new Fraction(top2, bot2);
                fraction.execute(fraction, fraction2);
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
        System.out.println("6 ---- Rock-Paper-Scissors");
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
                System.out.println("Please enter string values of player 1 and player 2 to plays rock paper scissors game: ");
                String player1 = scanner.next();
                String player2 = scanner.next();
                RockPaperScissors rockPaperScissors = new RockPaperScissors();
                rockPaperScissors.execute(player1, player2);
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
                YesOrNo yesOrNo = new YesOrNo();
                yesOrNo.execute(b);
            }
        }
    }

    private void runLoopPart() {

        System.out.println("You selected LOOP part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Repeat-String");
        System.out.println("2 ---- Cat-Dog-Years");
        System.out.println("3 ---- Average-Marks");
        System.out.println("4 ---- Beginner - Lost Without a Map");
        System.out.println("5 ---- Counting sheep...");
        System.out.println("6 ---- Reversed sequence");
        System.out.println("13 ---- Grasshopper - Summation");
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
                System.out.println("Please enter a number of human years to know how old are cat or dog: ");
                int num = scanner.nextInt();
                CatDogYears catDogYears = new CatDogYears();
                catDogYears.execute(num);
            }

            case 3 -> {
                System.out.println("Please enter an array of marks to know it avg: ");
                System.out.println("Please enter how much elements array will contain: ");
                int num = scanner.nextInt();
                int[] array = new int[num];
                System.out.println("Enter the elements of the array: ");
                for (int i = 0; i < num; i++) {
                    array[i] = scanner.nextInt();
                }
                AverageMarks averageMarks = new AverageMarks();
                averageMarks.execute(array);

            }

            case 4 -> {
                System.out.print("Enter the number of elements you want to store: ");
                int num = scanner.nextInt();
                int[] array = new int[num];
                System.out.println("Enter the elements of the array: ");
                for (int i = 0; i < num; i++) {
                    array[i] = scanner.nextInt();
                }
                Maps maps = new Maps();
                maps.execute(array);
            }

            case 5 -> {
                System.out.print("Enter the number of elements you want to store: ");
                int num = scanner.nextInt();
                boolean[] array = new boolean[num];
                System.out.println("Enter true or false for all elements of array: ");
                for (int i = 0; i < num; i++) {
                    array[i] = scanner.nextBoolean();
                }
                Counter counter = new Counter();
                counter.execute(array);
            }

            case 6 -> {
                System.out.println("Please enter a number : ");
                int num = scanner.nextInt();
                Sequence sequence = new Sequence();
                sequence.execute(num);
            }

            case 7 -> {
            }
            case 13 -> {
                System.out.println("Please enter a number : ");
                int num = scanner.nextInt();
                GrassHopper grassHopper = new GrassHopper();
                grassHopper.execute(num);
            }
        }
    }

    private void runOopPart() {

        System.out.println("You selected OOP part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Adam-And-Eve");
        System.out.println("2 ---- Multiplying-Two-Numbers");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("7 ---- Time-After-Midnight");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        int numOfTaskOopPart = scanner.nextInt();

        switch (numOfTaskOopPart) {

            case 1 -> {
                AdamAndEve adamAndEve = new AdamAndEve();
                adamAndEve.execute();
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
        System.out.println("1 ---- Number-To-String");
        System.out.println("2 ---- String-Reverse");
        System.out.println("3 ---- Welcome-To-The-City");
        System.out.println("5 ---- Replace all dots");
        System.out.println("6 ---- Are You Playing Banjo?");
        System.out.println("7 ---- Remove String Spaces");
        System.out.println("8 ---- Triple Trouble");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        int numOfTaskStringPart = scanner.nextInt();

        switch (numOfTaskStringPart) {

            case 1 -> {
                System.out.println("Please enter a number you want to convert to string: ");
                int num = scanner.nextInt();
                NumToString numToString = new NumToString();
                numToString.execute(num);
            }

            case 2 -> {
                System.out.println("Please enter a string to see reversed: ");
                String str = scanner.next();
                StringReverse stringReverse = new StringReverse();
                stringReverse.execute(str);

            }

            case 3 -> {
                System.out.println("Please enter name, city and state to see a greeting: ");
                System.out.println("Enter how many names you like to add: ");
                int numOfNames = scanner.nextInt();
                String[] names = new String[numOfNames];
                for (int i = 0; i < numOfNames; i++) {
                    names[i] = scanner.next();
                }
                String city = scanner.next();
                String state = scanner.next();
                WelcomeToCity welcomeToCity = new WelcomeToCity();
                welcomeToCity.execute(names, city, state);
            }

            case 4 -> {
                System.out.println("Please enter a number to see opposite of it: ");
                int num = scanner.nextInt();
                OppositeNumber oppositeNumber = new OppositeNumber();
                oppositeNumber.execute(num);
            }

            case 5 -> {
                System.out.println("Please enter a text for replace all the dots: ");
                String str = scanner.nextLine();
                Dinglemouse dinglemouse = new Dinglemouse();
                dinglemouse.execute(str);
            }

            case 6 -> {
                System.out.println("Please enter your name: ");
                String str = scanner.nextLine();
                Banjo banjo = new Banjo();
                banjo.execute(str);
            }

            case 7 -> {
                System.out.println("Please enter your text for remove the spaces: ");
                String str = scanner.nextLine();
                RemoveStringSpaces removeStringSpaces = new RemoveStringSpaces();
                removeStringSpaces.execute(str);
            }
            case 8 -> {
                System.out.println("Please enter three strings: ");
                String one = scanner.nextLine();
                String two = scanner.nextLine();
                String three = scanner.nextLine();
                TripleTrouble tripleTrouble = new TripleTrouble();
                tripleTrouble.execute(one, two, three);
            }
        }
    }

    private void runCollectionPart() {

        System.out.println("You selected COLLECTION part: ");
        System.out.println("Please enter a number of task you want to run:");
        System.out.println("1 ---- Push-Object-Into-List");
        System.out.println("2 ---- Unfinished Loop");
        System.out.println("3 ---- Volume-Of-Cuboid");
        System.out.println("7 ---- Time-After-Midnight");
        System.out.println("====================================");
        System.out.println("Please select number of task: ");

        int numOfTaskCollectionPart = scanner.nextInt();

        switch (numOfTaskCollectionPart) {

            case 1 -> {
                System.out.println("Please enter a string to add it into List: ");
                String str = scanner.next();
                PushObjectIntoArray pushObjectIntoArray = new PushObjectIntoArray();
                pushObjectIntoArray.execute(str);
            }

            case 2 -> {
                System.out.println("Please enter a number : ");
                int num = scanner.nextInt();
                UnfinishedLoop unfinishedLoop = new UnfinishedLoop();
                unfinishedLoop.execute(num);


            }

            case 3 -> {
            }

            case 4 -> {
            }
        }
    }
}
