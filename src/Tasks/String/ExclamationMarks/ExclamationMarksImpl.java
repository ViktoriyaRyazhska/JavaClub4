package Tasks.String.ExclamationMarks;

public class ExclamationMarksImpl implements ExclamationMarks {
    private String str;
    private int n;

    public ExclamationMarksImpl(final String str, final int n) {
        setStr(str);
        setN(n);
    }

    public String getStr() {
        return str;
    }

    public void setStr(final String str) {
        if(str.matches("(.*)\\!(.*)")){
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
        String newStr = "";
        int count = 0;
        for (int i = 0; i < getStr().length(); i++){
            if(getStr().charAt(i) == '!'){
                count++;
                if(count <= n){
                    continue;
                }else{
                    newStr += String.valueOf(str.charAt(i));
                }
            }else{
                newStr += String.valueOf(str.charAt(i));
            }
        }
        return newStr;
    }
}
