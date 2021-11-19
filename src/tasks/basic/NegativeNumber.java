package tasks.basic;

public class NegativeNumber {
    public static void execute( int x) {
        System.out.println(negativeNumber(x));

    }
 private static int negativeNumber(int x){
     if(x>0){
         return -x;
     }
     else return x;
 }
}


