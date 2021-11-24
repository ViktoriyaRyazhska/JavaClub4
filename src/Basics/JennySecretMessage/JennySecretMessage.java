package Basics.JennySecretMessage;

/**
 * Jenny has written a function that returns a greeting for a user.
 * However, she's in love with Johnny, and would like to greet him slightly different.
 * She added a special case to her function, but she made a mistake.
 */
public class JennySecretMessage {
    public static String greet(String name) {
        return name.equals("Johnny") ? "Hello, my love!" : "Hello, " + name + "!";
    }
}

