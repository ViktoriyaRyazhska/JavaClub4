package application;

import application.utility.ChoiceList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(ChoiceList.listOfLists());
        ChoiceList.choiceList(in);
    }
}

