package Tasks.String.TwoWordName;

import java.util.Scanner;

public class TwoWordNameImpl implements TwoWordName {
    private String name;
    private String surname;

    public TwoWordNameImpl(final Scanner scanner) {
        setName(scanner.nextLine());
        setSurname(scanner.nextLine());
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if (!name.isEmpty() && name.matches("\\b[a-zA-Z][a-z]*\\b")) {
            this.name = name;
        } else {
            this.name = "Maksym";
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        if (!surname.isEmpty() && surname.matches("\\b[a-zA-Z][a-z]*\\b")) {
            this.surname = surname;
        } else {
            this.surname = "Danyliuk";
        }
    }

    @Override
    public String convertNameToInitials() {
        String initials = "";
        initials = String.valueOf(getName().charAt(0)).toUpperCase() + "." + String.valueOf(getSurname().charAt(0)).toUpperCase();
        return initials;
    }
}
