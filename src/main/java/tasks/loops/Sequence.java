package tasks.loops;
public class Sequence{

    public static int[] reverse(int n){
        int [] array = new int[n];
        for(int i = 0; i <array.length; i++){
            array[i] =n;
            n--;
        }
        return array;
    }
    public void execute(int n){
        System.out.println(reverse(n));
    }
}