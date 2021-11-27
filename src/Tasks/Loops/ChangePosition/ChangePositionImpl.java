package Tasks.Loops.ChangePosition;

import java.util.Scanner;

public class ChangePositionImpl implements ChangePosition {
    private final static String[] ARRAY = {"tail", "body", "head"};
    private String[] array = new String[3];
    private String partOfBody;

    public ChangePositionImpl(final Scanner scanner) {
        for (int i = 0; i < 3; i++) {
            setPartOfBody(scanner);
            for (int j = 0; j < i; j++) {
                while (getPartOfBody().equals(getArray()[j])) {
                    System.out.println("Please enter another part of the body:");
                    setPartOfBody(scanner);
                }
            }
            getArray()[i] = getPartOfBody();
        }
    }

    public static String[] getARRAY() {
        return ARRAY;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(final String[] array) {
        this.array = array;
    }

    public String getPartOfBody() {
        return partOfBody;
    }

    public void setPartOfBody(final Scanner scanner) {
        System.out.println("Enter the part of body: ");
        String value = scanner.nextLine();

        if (!(value.equals("head") || value.equals("body") || value.equals("tail"))) {
            do {
                System.out.println("Wrong value");
                value = scanner.nextLine();
            } while (!(value.equals("head") || value.equals("body") || value.equals("tail")));
        }
        this.partOfBody = value;
    }

    @Override
    public String[] sorting() {
        String tmp;
        for (int i = 0; i < 3; i++) {
            if (!getArray()[i].equals(getARRAY()[i])) {
                for (int j = 0; j < 3; j++) {
                    if (getArray()[j].equals(getARRAY()[i])) {
                        tmp = getArray()[i];
                        getArray()[i] = getArray()[j];
                        getArray()[j] = tmp;
                    }
                }
            }
        }
        return getArray();
    }
}
