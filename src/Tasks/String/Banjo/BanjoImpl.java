package Tasks.String.Banjo;

import java.util.Scanner;

public class BanjoImpl implements Banjo {
    private String name;

    public BanjoImpl(final Scanner scanner) {
        setName(scanner.nextLine());
    }

    public BanjoImpl(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if (!name.isEmpty() && name.matches("\\b([A-Z][a-z]*)\\b")) {
            this.name = name;
        } else {
            this.name = "Maksym";
        }
    }

    @Override
    public String playingBanjo() {
        if (getName().charAt(0) == 'R' || getName().charAt(0) == 'r') {
            return getName() + " plays banjo";
        } else {
            return getName() + " does not play banjo";
        }
    }
}
