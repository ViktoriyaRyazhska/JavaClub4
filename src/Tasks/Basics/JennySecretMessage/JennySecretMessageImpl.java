package Tasks.Basics.JennySecretMessage;

import java.util.Scanner;

/**
 * Jenny has written a function that returns a greeting for a user.
 * However, she's in love with Johnny, and would like to greet him slightly different.
 * She added a special case to her function, but she made a mistake.
 */
public class JennySecretMessageImpl implements JennySecretMessage {
    private String name;

    public JennySecretMessageImpl(final Scanner scanner) {
        setName(scanner.nextLine());
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
        return getName().equals("Johnny") ? "Hello, my love!" : "Hello, " + name + "!";
    }
}

