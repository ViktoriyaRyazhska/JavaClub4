package Loops.StringRepeat;

import java.util.Scanner;

public class StringRepeatImpl implements StringRepeat {
    private String str;
    private int n;

    public StringRepeatImpl(final Scanner scanner) {
        setStr(scanner.nextLine());
        setN(scanner.nextInt());
    }

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
       if(!str.isEmpty() && !str.contains(" ")){
           this.str = str;
       }else{
           this.str = "String";
       }
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
        this.n = Math.max(n, 2);
    }

    @Override
    public void toRepeatString() {
        for (int i = 0; i < getN(); i++) {
            System.out.print(getStr());
        }
        System.out.println();
    }
}
