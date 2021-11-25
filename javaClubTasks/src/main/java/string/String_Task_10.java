package string;

public class String_Task_10 {
    public static String fakeBin(String numberString) {
        char [] arr = numberString.toCharArray();
        String newstr = "";
        int counter = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            char key = arr[i];
            switch (key) {
                case '0':
                    newstr+=0;
                    break;
                case '1':
                    newstr+=0;
                    break;
                case '2':
                    newstr+=0;
                    break;
                case '3':
                    newstr+=0;
                    break;
                case '4':
                    newstr+=0;
                    break;
                case '5':
                    newstr+=1;
                    break;
                case '6':
                    newstr+=1;
                    break;
                case '7':
                    newstr+=1;
                    break;
                case '8':
                    newstr+=1;
                    break;
                case '9':
                    newstr+=1;
                    break;
            }
        }
        return newstr;
    }
}
