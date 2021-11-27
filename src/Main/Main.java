package Main;

import Main.MainSwitch.*;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final MainSwitch mainSwitch = new MainSwitchImpl();
        mainSwitch.ChooseOption(scanner);

        scanner.close();
    }
}