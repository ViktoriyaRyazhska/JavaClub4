package classes;

import java.util.Scanner;

public class Classes_Task_1 {
    private int number;
    private String stringValue;
    private Object anObject;

    public Classes_Task_1() {
    }

    public Classes_Task_1(int number, String stringValue, Object anObject) {
        this.number = number;
        this.stringValue = stringValue;
        this.anObject = anObject;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void setAnObject(Object anObject) {
        this.anObject = anObject;
    }

    public int getNumber() {
        return number;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Object getAnObject() {
        return anObject;
    }

    public static void solveTask(){
        System.out.println("This task is made for studying one of the most important\nOOP principle - encapsulation." +
                "Encapsulation is defined as the wrapping up of data under a single unit." +
                "\nSo you can access to variables only using getters and setters" +
                "Also you must make all fields private and provide empty constructor");


        System.out.println("Here you can see how it looks if you've done everything correctly:\n" +
                "public class Classes_Task_1 {\n" +
                "    private int number;\n" +
                "    private String stringValue;\n" +
                "    private Object anObject;\n" +
                "\n" +
                "    public Classes_Task_1() {\n" +
                "    }\n" +
                "\n" +
                "    public Classes_Task_1(int number, String stringValue, Object anObject) {\n" +
                "        this.number = number;\n" +
                "        this.stringValue = stringValue;\n" +
                "        this.anObject = anObject;\n" +
                "    }\n" +
                "\n" +
                "    public void setNumber(int number) {\n" +
                "        this.number = number;\n" +
                "    }\n" +
                "\n" +
                "    public void setStringValue(String stringValue) {\n" +
                "        this.stringValue = stringValue;\n" +
                "    }\n" +
                "\n" +
                "    public void setAnObject(Object anObject) {\n" +
                "        this.anObject = anObject;\n" +
                "    }\n" +
                "\n" +
                "    public int getNumber() {\n" +
                "        return number;\n" +
                "    }\n" +
                "\n" +
                "    public String getStringValue() {\n" +
                "        return stringValue;\n" +
                "    }\n" +
                "\n" +
                "    public Object getAnObject() {\n" +
                "        return anObject;\n" +
                "    }");


    }

}


