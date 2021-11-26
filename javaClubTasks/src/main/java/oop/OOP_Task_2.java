package oop;

import java.util.Scanner;

public class OOP_Task_2 {
    public static final OOP_Task_2 IDENTITY = new OOP_Task_2(0);
    public static final OOP_Task_2 ROTATE_90_ANTICLOCKWISE = new OOP_Task_2(1);
    public static final OOP_Task_2 ROTATE_180 = new OOP_Task_2(2);
    public static final OOP_Task_2 ROTATE_90_CLOCKWISE = new OOP_Task_2(3);
    public static final OOP_Task_2 REFLECT_VERTICAL = new OOP_Task_2(4);
    public static final OOP_Task_2 REFLECT_FORWARD_DIAGONAL = new OOP_Task_2(5);
    public static final OOP_Task_2 REFLECT_HORIZONTAL = new OOP_Task_2(6);
    public static final OOP_Task_2 REFLECT_REVERSE_DIAGONAL = new OOP_Task_2(7);

    private final int index;
    private static int[][] matrix = {{0, 1, 2, 3, 4, 5, 6, 7},
            {1, 2, 3, 0, 5, 6, 7, 4},
            {2, 3, 0, 1, 6, 7, 4, 5},
            {3, 0, 1, 2, 7, 4, 5, 6},
            {4, 7, 6, 5, 0, 3, 2, 1},
            {5, 4, 7, 6, 1, 0, 3, 2},
            {6, 5, 4, 7, 2, 1, 0, 3},
            {7, 6, 5, 4, 3, 2, 1, 0}};

    private OOP_Task_2(int index) {
        this.index = index;
    }

    public OOP_Task_2() {
        this.index = -1;
    }

    public OOP_Task_2 then(OOP_Task_2 f) {
        return new OOP_Task_2(matrix[this.index][f.index]);
    }

    public OOP_Task_2 inv() {
        switch (index) {
            case 1: return new OOP_Task_2(3);
            case 3: return new OOP_Task_2(1);
            default: return this;
        }
    }

    public boolean is_rotation() {
        return index < 4;
    }

    public boolean is_reflection() {
        return index >= 4;
    }

    public boolean equals(OOP_Task_2 other) {
        return this.index == other.index;
    }

    @Override
    public String toString() {
        return "OOP_Task_2{" +
                "index=" + index +
                '}';
    }

    public static void solveTask(){
        System.out.println("In this kata we're going to write a class Dih4 that represents this collection\n " +
                "of rotations and reflections. An object (instance) of this class will\n" +
                " have one of eight possible values, corresponding to the eight transformations.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick the first value : \n" +
                "1. IDENTITY \n" +
                "2. ROTATE_90_ANTICLOCKWISE \n" +
                "3. ROTATE_180 \n" +
                "4. ROTATE_90_CLOCKWISE \n" +
                "5. REFLECT_VERTICAL \n" +
                "6. REFLECT_FORWARD_DIAGONAL \n" +
                "7. REFLECT_HORIZONTAL \n" +
                "8. REFLECT_REVERSE_DIAGONAL");
        int value1 = scanner.nextInt();
        OOP_Task_2 val = IDENTITY;
        switch(value1){
            case 1 : {
                 val = IDENTITY;
                break;
            }
            case 2 : {
                 val = ROTATE_90_ANTICLOCKWISE;
                break;
            }
            case 3 : {
                 val = ROTATE_180;
                break;
            }
            case 4 : {
                 val = ROTATE_90_CLOCKWISE;
                break;
            }
            case 5 : {
                 val = REFLECT_VERTICAL;
                break;
            }
            case 6 : {
                 val = REFLECT_FORWARD_DIAGONAL;
                break;
            }
            case 7 : {
                 val = REFLECT_HORIZONTAL;
                break;
            }
            case 8 : {
                 val = REFLECT_REVERSE_DIAGONAL;
                break;
            }
        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Pick the method : \n" +
                "1. Is picked value a rotation? \n" +
                "2. Is picked value a reflection? \n" +
                "3. Than \n" +
                "4. Inverse \n" +
                "5. Equals ");
        int value2 = scanner1.nextInt();
        switch(value2){
            case 1 :{
                System.out.println(val.is_rotation());
                break;
            }
            case 2 :{
                System.out.println(val.is_reflection());
                break;
            }
            case 3 :{
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Pick second value : \n" +
                        "1. IDENTITY \n" +
                        "2. ROTATE_90_ANTICLOCKWISE \n" +
                        "3. ROTATE_180 \n" +
                        "4. ROTATE_90_CLOCKWISE \n" +
                        "5. REFLECT_VERTICAL \n" +
                        "6. REFLECT_FORWARD_DIAGONAL \n" +
                        "7. REFLECT_HORIZONTAL \n" +
                        "8. REFLECT_REVERSE_DIAGONAL");
                int value3 = scanner.nextInt();
                OOP_Task_2 val1 = IDENTITY;
                switch(value1){
                    case 1 : {
                        val1 = IDENTITY;
                        break;
                    }
                    case 2 : {
                        val1 = ROTATE_90_ANTICLOCKWISE;
                        break;
                    }
                    case 3 : {
                        val1 = ROTATE_180;
                        break;
                    }
                    case 4 : {
                        val1 = ROTATE_90_CLOCKWISE;
                        break;
                    }
                    case 5 : {
                        val1 = REFLECT_VERTICAL;
                        break;
                    }
                    case 6 : {
                        val1 = REFLECT_FORWARD_DIAGONAL;
                        break;
                    }
                    case 7 : {
                        val1 = REFLECT_HORIZONTAL;
                        break;
                    }
                    case 8 : {
                        val1 = REFLECT_REVERSE_DIAGONAL;
                        break;
                    }
                }
                System.out.println(val.then(val1));
            }
            case 4 :{
                System.out.println(val.inv());
            }
            case 5 :{
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("Pick second value : \n" +
                        "1. IDENTITY \n" +
                        "2. ROTATE_90_ANTICLOCKWISE \n" +
                        "3. ROTATE_180 \n" +
                        "4. ROTATE_90_CLOCKWISE \n" +
                        "5. REFLECT_VERTICAL \n" +
                        "6. REFLECT_FORWARD_DIAGONAL \n" +
                        "7. REFLECT_HORIZONTAL \n" +
                        "8. REFLECT_REVERSE_DIAGONAL");
                int value4 = scanner.nextInt();
                OOP_Task_2 val1 = IDENTITY;
                switch(value1){
                    case 1 : {
                        val1 = IDENTITY;
                        break;
                    }
                    case 2 : {
                        val1 = ROTATE_90_ANTICLOCKWISE;
                        break;
                    }
                    case 3 : {
                        val1 = ROTATE_180;
                        break;
                    }
                    case 4 : {
                        val1 = ROTATE_90_CLOCKWISE;
                        break;
                    }
                    case 5 : {
                        val1 = REFLECT_VERTICAL;
                        break;
                    }
                    case 6 : {
                        val1 = REFLECT_FORWARD_DIAGONAL;
                        break;
                    }
                    case 7 : {
                        val1 = REFLECT_HORIZONTAL;
                        break;
                    }
                    case 8 : {
                        val1 = REFLECT_REVERSE_DIAGONAL;
                        break;
                    }
                }
                System.out.println(val.equals(val1));
            }
        }
    }
}
