package Main;

import Main.MainSwitch.MainSwitch;
import Main.MainSwitch.MainSwitchImpl;

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final MainSwitch mainSwitch = new MainSwitchImpl();
        mainSwitch.ChooseOption(scanner);
    }
}