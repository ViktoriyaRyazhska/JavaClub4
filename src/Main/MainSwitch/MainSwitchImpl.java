package Main.MainSwitch;

import Switchs.BasicsSwitch.BasicsSwitch;
import Switchs.ClassesSwitch.ClassesSwitch;
import Switchs.CollectionsSwitch.CollectionsSwitch;
import Switchs.ConditionsSwitch.ConditionsSwitch;
import Switchs.LoopsSwitch.LoopsSwitch;
import Switchs.StringSwitch.StringSwitch;
import Switchs.Switch;

import java.util.Scanner;

public class MainSwitchImpl implements MainSwitch {
    @Override
    public void ChooseOption(final Scanner scanner) {
        System.out.println(ShowOptions());
        System.out.println("Choose one of options: ");
        final int task = scanner.nextInt();
        scanner.nextLine();

        switch (task) {
            case 1 -> {
                final Switch sw = new BasicsSwitch();
                Menu(sw, scanner);
            }
            case 2 -> {
                final Switch sw = new ClassesSwitch();
                Menu(sw, scanner);
            }
            case 3 -> {
                final Switch sw = new CollectionsSwitch();
                Menu(sw, scanner);
            }
            case 4 -> {
                final Switch sw = new ConditionsSwitch();
                Menu(sw, scanner);
            }
            case 5 -> {
                final Switch sw = new LoopsSwitch();
                Menu(sw, scanner);
            }
            case 6 -> {
                final Switch sw = new StringSwitch();
                Menu(sw, scanner);
            }
            case 0 -> {
            }
            default -> {
                System.out.println("There is no " + task + " option! Try again!");
                new MainSwitchImpl().ChooseOption(scanner);
            }
        }
    }

    @Override
    public String ShowOptions() {
        return """
                List of options:\040
                1. Basics tasks
                2. Classes tasks
                3. Collections tasks
                4. Conditions tasks
                5. Loops tasks
                6. String tasks
                0. EXIT
                """;
    }

    @Override
    public void Menu(final Switch sw, final Scanner scanner) {
        sw.ShowOptions();
        sw.ChooseOption(scanner);
    }
}
