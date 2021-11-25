package com.company;

import java.io.BufferedReader;
import java.io.IOException;

public class Sticks21 implements Executable{
    public static int makeMove(int sticks) {
        return sticks % 4;
    }
    public void programRunner(BufferedReader reader) throws IOException{
        System.out.print("Enter your name: ");
        String firstPlayerName = reader.readLine();
        String secondPlayerName = "Robot";
        String name;
        if (firstPlayerName.isEmpty()) firstPlayerName = "Rob";
        int str;
        int sticks = 21;
        int counter = 0;
        while (true) {
            name = (counter % 2 == 0) ? secondPlayerName : firstPlayerName;
            if (counter % 2 == 0) {
                str = makeMove(sticks);
            } else {
                try {
                    str = Integer.parseInt(reader.readLine());
                    if (str < 1 || str > 3) {
                        System.out.println("You entered incorrect value. Try again");
                        continue;
                    }
                } catch(NumberFormatException e) {
                    System.out.println("You entered incorrect value. Try again");
                    continue;
                }
            }
            System.out.print(name + " takes " + str + " --> ");
            if (sticks - str <= 0) {
                System.out.println(name + " wins!");
                break;
            }
            sticks -= str;
            System.out.println(sticks + " sticks left");
            counter++;
        }
    }

    public void execute(BufferedReader reader) throws IOException {
        System.out.println("In this game, there are 21 sticks lying in a pile. " +
                "Players take turns taking 1, 2, or 3 sticks. The last person to take a stick wins.");
        programRunner(reader);
    }
}
