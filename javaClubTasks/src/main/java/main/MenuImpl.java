package main;

import basic_program.Basic_Program_Task_4;
import basic_program.Basic_Program_Task_8;
import classes.Classes_Task_4;
import collections.Collections_Task_4;
import conditions.Conditions_task_12;
import conditions.Conditions_task_14;
import conditions.Conditions_task_4;
import conditions.Conditions_task_8;
import loops.Loops_Task_12;
import loops.Loops_Task_14;
import loops.Loops_Task_4;
import loops.Loops_Task_8;
import oop.OOP_Task_4;
import string.*;

import java.util.Scanner;

public class MenuImpl {

    public static void showMenu() {
        System.out.println("*****************************");
        System.out.println("*  Please choose a package  *");
        System.out.println("*  1 : Basic Program        *");
        System.out.println("*  2 : Classes              *");
        System.out.println("*  3 : Collection           *");
        System.out.println("*  4 : Conditions           *");
        System.out.println("*  5 : Loops                *");
        System.out.println("*  6 : OOP                  *");
        System.out.println("*  7 : String               *");
        System.out.println("*  0 : EXIT                 *");
        System.out.println("*****************************");
    }

    public static int isNumeric(String str) {
        int value = 0;
        try {
            value = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            System.out.println("Incorrect Data, please enter a task Number!");
            chooseMenu();
        }
        return value;
    }


    public static void chooseMenu() {
        showMenu();
        Scanner scanner = new Scanner(System.in);
        String menu1 = scanner.next();

        switch (isNumeric(menu1)) {
            case 1: {
                System.out.println("********************************************");
                System.out.println("*  You are in the package 'Basic Program'  *");
                System.out.println("*  Choose a task:                          *");
                System.out.println("*  4 : Task 4                              *");
                System.out.println("*  8 : Task 8                              *");
                System.out.println("*  0 : Return to Main Menu                 *");
                System.out.println("********************************************");

                String basic_program_value = scanner.next();

                switch (isNumeric(basic_program_value)) {
                    case 4: {
                        Basic_Program_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 8: {
                        Basic_Program_Task_8.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 0: {
                        chooseMenu();
                        break;
                    }
                    default: {
                        System.out.println("Please enter a correct number!");
                        chooseMenu();
                        break;
                    }
                }
                break;
            }

            case 2: {
                System.out.println("**************************************");
                System.out.println("*  You are in the package 'Classes'  *");
                System.out.println("*  Choose a task:                    *");
                System.out.println("*  4 : Task 4                        *");
                System.out.println("*  0 : Return to Main Menu           *");
                System.out.println("**************************************");

                String classes_value = scanner.next();

                switch (isNumeric(classes_value)) {
                    case 4: {
                        System.out.println("Result: ");
                        Classes_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 0: {
                        chooseMenu();
                        break;
                    }
                    default: {
                        System.out.println("Please enter a correct number!");
                        chooseMenu();
                        break;
                    }
                }
                break;
            }

            case 3: {
                System.out.println("******************************************");
                System.out.println("*  You are in the package 'Сollections'  *");
                System.out.println("*  Choose a task:                        *");
                System.out.println("*  4 : Task 4                            *");
                System.out.println("*  0 : Return to Main Menu               *");
                System.out.println("******************************************");

                String collections_value = scanner.next();

                switch (isNumeric(collections_value)) {
                    case 4: {
                        System.out.println("Result: ");
                        Collections_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 0: {
                        chooseMenu();
                        break;
                    }
                    default: {
                        System.out.println("Please enter a correct number!");
                        chooseMenu();
                        break;
                    }
                }
                break;
            }

            case 4: {
                System.out.println("*****************************************");
                System.out.println("*  You are in the package 'Conditions'  *");
                System.out.println("*  Choose a task:                       *");
                System.out.println("*  4 : Task 4                           *");
                System.out.println("*  8 : Task 8                           *");
                System.out.println("*  12 : Task 12                         *");
                System.out.println("*  14 : Task 14                         *");
                System.out.println("*  0 : Return to Main Menu              *");
                System.out.println("*****************************************");

                String conditions_value = scanner.next();

                switch (isNumeric(conditions_value)) {
                    case 4: {
                        Conditions_task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 8: {
                        Conditions_task_8.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 12: {
                        Conditions_task_12.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 14: {
                        Conditions_task_14.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 0: {
                        chooseMenu();
                        break;
                    }
                    default: {
                        System.out.println("Please enter a correct number!");
                        chooseMenu();
                        break;
                    }
                }
                break;
            }

            case 5: {
                System.out.println("************************************");
                System.out.println("*  You are in the package 'Loops'  *");
                System.out.println("*  Choose a task:                  *");
                System.out.println("*  4 : Task 4                      *");
                System.out.println("*  8 : Task 8                      *");
                System.out.println("*  12 : Task 12                    *");
                System.out.println("*  14 : Task 14                    *");
                System.out.println("*  0 : Return to Main Menu         *");
                System.out.println("************************************");

                String loops_value = scanner.next();

                switch (isNumeric(loops_value)) {
                    case 4: {
                        Loops_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 8: {
                        Loops_Task_8.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 12: {
                        Loops_Task_12.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 14: {
                        Loops_Task_14.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 0: {
                        chooseMenu();
                        break;
                    }
                    default: {
                        System.out.println("Please enter a correct number!");
                        chooseMenu();
                        break;
                    }
                }
                break;
            }

            case 6: {
                System.out.println("**********************************");
                System.out.println("*  You are in the package 'OOP'  *");
                System.out.println("*  Choose a task:                *");
                System.out.println("*  4 : Task 4                    *");
                System.out.println("*  0 : Return to Main Menu       *");
                System.out.println("**********************************");

                String oop_value = scanner.next();

                switch (isNumeric(oop_value)) {
                    case 4: {
                        System.out.println("Result");
                        OOP_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 0: {
                        chooseMenu();
                        break;
                    }
                    default: {
                        System.out.println("Please enter a correct number!");
                        chooseMenu();
                        break;
                    }
                }
                break;
            }

            case 7: {
                System.out.println("*************************************");
                System.out.println("*  You are in the package 'String'  *");
                System.out.println("*  Choose a task:                   *");
                System.out.println("*  4 : Task 4                       *");
                System.out.println("*  8 : Task 8                       *");
                System.out.println("*  12 : Task 12                     *");
                System.out.println("*  16 : Task 16                     *");
                System.out.println("*  17 : Task 17                     *");
                System.out.println("*  0 : Return to Main Menu          *");
                System.out.println("*************************************");

                String loops_value = scanner.next();

                switch (isNumeric(loops_value)) {
                    case 4: {
                        String_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 8: {
                        String_Task_8.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 12: {
                        String_Task_12.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 16: {
                        String_Task_16.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 17: {
                        String_Task_17.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 0: {
                        chooseMenu();
                        break;
                    }
                    default: {
                        System.out.println("Please enter a correct number!");
                        chooseMenu();
                        break;
                    }
                }
                break;
            }

            case 0: {
                System.out.println("Bye =)");
                System.exit(0);
                break;
            }

            default: {
                System.out.println("Please enter a correct number!");
                chooseMenu();
                break;
            }

        }

    }

}
