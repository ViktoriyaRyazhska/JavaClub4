package Tasks.String.ExclamationMarks;

import java.util.Scanner;

public class ExclamationMarksImpl implements ExclamationMarks {
    private String str;
    private int n;

    public ExclamationMarksImpl(final Scanner scanner) {
        setStr(scanner.nextLine());
        setN(scanner.nextInt());
    }

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
        if(!str.isEmpty() && str.matches("(.*)!*(.*)")){
            this.str = str;
        }else{
            this.str = " !!Hi !";
        }
    }

    public int getN() {
        return n;
    }

    public void setN(final int n) {
        this.n = Math.max(n, 1);
    }

    @Override
    public String removeExclamationMarks() {
        final StringBuilder newStr = new StringBuilder();
        int count = 0;
        for (int i = 0; i < getStr().length(); i++){
            if(getStr().charAt(i) == '!'){
                count++;
                if(count < n){
                    continue;
                }else{
                    newStr.append(getStr().charAt(i));
                }
            }else{
                newStr.append(getStr().charAt(i));
            }
        }
        return newStr.toString();
    }
}
