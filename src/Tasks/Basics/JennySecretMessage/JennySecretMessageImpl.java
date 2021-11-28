package Tasks.Basics.JennySecretMessage;

import java.util.Scanner;

public class JennySecretMessageImpl implements JennySecretMessage {
    private String name;

    public JennySecretMessageImpl(final Scanner scanner) {
        setName(scanner.nextLine());
    }

    public JennySecretMessageImpl(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if (!name.isEmpty() && name.matches("\\b([A-Z][a-z]*)\\b")) {
            this.name = name;
        } else {
            this.name = "Mark";
        }
    }

    @Override
    public String toGreet() {
        return getName().equals("Johnny") ? "Hello, my love!" : "Hello, " + getName() + "!";
    }
}

