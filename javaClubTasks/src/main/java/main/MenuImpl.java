package main;

import basic_program.*;

import classes.*;
import collections.*;
import conditions.*;
import loops.*;
import oop.*;
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
                System.out.println("*  1 : Task 1                              *");
                System.out.println("*  2 : Task 2                              *");
                System.out.println("*  4 : Task 4                              *");
                System.out.println("*  5 : Task 5                              *");
                System.out.println("*  6 : Task 6                              *");
                System.out.println("*  8 : Task 8                              *");
                System.out.println("*  9 : Task 9                              *");
                System.out.println("* 10 : Task 10                             *");
                System.out.println("*  0 : Return to Main Menu                 *");
                System.out.println("********************************************");

                String basic_program_value = scanner.next();

                switch (isNumeric(basic_program_value)) {
                    case 1: {
                        Basic_Program_Task_1.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 2: {
                        Basic_Program_Task_2.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 4: {
                        Basic_Program_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 5: {
                        Basic_Program_Task_5.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 6: {
                        Basic_Program_Task_6.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 8: {
                        Basic_Program_Task_8.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 9: {
                        Basic_Program_Task_9.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 10: {
                        Basic_Program_Task_10.solveTask();
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
                System.out.println("*  1 : Task 1                        *");
                System.out.println("*  2 : Task 2                        *");
                System.out.println("*  4 : Task 4                        *");
                System.out.println("*  5 : Task 5                        *");
                System.out.println("*  6 : Task 6                        *");
                System.out.println("*  0 : Return to Main Menu           *");
                System.out.println("**************************************");

                String classes_value = scanner.next();

                switch (isNumeric(classes_value)) {
                    case 1: {
                        Classes_Task_1.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 2: {
                        Classes_Task_2.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 4: {
                        System.out.println("Result: ");
                        Classes_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 5: {
                        Classes_Task_5_Game.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 6: {
                        Classes_Task_6.solveTask();
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
                System.out.println("*  1 : Task 1                            *");
                System.out.println("*  2 : Task 2                            *");
                System.out.println("*  4 : Task 4                            *");
                System.out.println("*  0 : Return to Main Menu               *");
                System.out.println("******************************************");

                String collections_value = scanner.next();

                switch (isNumeric(collections_value)) {
                    case 1: {
                        Collections_Task_1.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 2: {
                        Collections_Task_2.solveTask();
                        chooseMenu();
                        break;
                    }
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
                System.out.println("*  1 : Task 1                           *");
                System.out.println("*  2 : Task 2                           *");
                System.out.println("*  4 : Task 4                           *");
                System.out.println("*  5 : Task 5                           *");
                System.out.println("*  6 : Task 6                           *");
                System.out.println("*  8 : Task 8                           *");
                System.out.println("*  9 : Task 9                           *");
                System.out.println("*  10 : Task 10                         *");
                System.out.println("*  12 : Task 12                         *");
                System.out.println("*  14 : Task 14                         *");
                System.out.println("*  0 : Return to Main Menu              *");
                System.out.println("*****************************************");

                String conditions_value = scanner.next();

                switch (isNumeric(conditions_value)) {

                    case 1: {
                        Conditions_task_1.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 2: {
                        Conditions_task_2.solveTask();

                        chooseMenu();
                        break;
                    }
                    case 4: {
                        Conditions_task_4.solveTask();
                        chooseMenu();
                        break;
                    }

                    case 5: {
                        Conditions_task_5.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 6: {
                        Conditions_task_6.solveTask();

                        chooseMenu();
                        break;
                    }
                    case 8: {
                        Conditions_task_8.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 9: {
                        Conditions_task_9.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 10: {
                        Conditions_task_10.solveTask();
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
                System.out.println("*  1 : Task 1                      *");
                System.out.println("*  2 : Task 2                      *");
                System.out.println("*  4 : Task 4                      *");
                System.out.println("*  5 : Task 5                      *");
                System.out.println("*  6 : Task 6                      *");
                System.out.println("*  8 : Task 8                      *");
                System.out.println("*  9 : Task 9                      *");
                System.out.println("*  10 : Task 10                    *");
                System.out.println("*  12 : Task 12                    *");
                System.out.println("*  13 : Task 13                    *");
                System.out.println("*  14 : Task 14                    *");
                System.out.println("*  0 : Return to Main Menu         *");
                System.out.println("************************************");

                String loops_value = scanner.next();

                switch (isNumeric(loops_value)) {

                    case 1: {
                        Loops_Task_1.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 2: {
                        Loops_Task_2.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 4: {
                        Loops_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 5: {
                        Loops_Task_5.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 6: {
                        Loops_Task_6.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 8: {
                        Loops_Task_8.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 9: {
                        Loops_Task_9.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 10: {
                        Loops_Task_10.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 12: {
                        Loops_Task_12.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 13: {
                        Loops_Task_13.solveTask();
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
                System.out.println("*  1 : Task 1                    *");
                System.out.println("*  2 : Task 2                    *");
                System.out.println("*  4 : Task 4                    *");
                System.out.println("*  0 : Return to Main Menu       *");
                System.out.println("**********************************");

                String oop_value = scanner.next();

                switch (isNumeric(oop_value)) {
                    case 1: {
                        OOP_Task_1.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 2: {
                        OOP_Task_2.solveTask();
                        chooseMenu();
                        break;
                    }
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
                System.out.println("*  1 : Task 1                       *");
                System.out.println("*  2 : Task 2                       *");
                System.out.println("*  4 : Task 4                       *");
                System.out.println("*  5 : Task 5                       *");
                System.out.println("*  6 : Task 6                       *");
                System.out.println("*  8 : Task 8                       *");
                System.out.println("*  9 : Task 9                       *");
                System.out.println("*  10 : Task 10                     *");
                System.out.println("*  12 : Task 12                     *");
                System.out.println("*  13 : Task 13                     *");
                System.out.println("*  14 : Task 14                     *");
                System.out.println("*  16 : Task 16                     *");
                System.out.println("*  17 : Task 17                     *");
                System.out.println("*  18 : Task 18                     *");
                System.out.println("*  0 : Return to Main Menu          *");
                System.out.println("*************************************");

                String loops_value = scanner.next();

                switch (isNumeric(loops_value)) {

                    case 1: {
                        String_Task_1.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 2: {
                        String_Task_2.solveTask();

                        chooseMenu();
                        break;
                    }
                    case 4: {
                        String_Task_4.solveTask();
                        chooseMenu();
                        break;
                    }

                    case 5: {
                        String_Task_5.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 6: {
                        String_Task_6.solveTask();

                        chooseMenu();
                        break;
                    }
                    case 8: {
                        String_Task_8.solveTask();
                        chooseMenu();
                        break;
                    }

                    case 9: {
                        String_Task_9.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 10: {
                        String_Task_10.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 12: {
                        String_Task_12.solveTask();
                        chooseMenu();
                        break;
                    }case 13: {
                        String_Task_13.solveTask();
                        chooseMenu();
                        break;
                    }
                    case 14: {
                        String_Task_14.solveTask();
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
                    case 18: {
                        String_Task_18.solveTask();
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

