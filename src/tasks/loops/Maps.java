package tasks.loops;

public class Maps {
    private static int[] map(int[] arr) {
        for(int i = 0; i<arr.length; i++){
            arr[i] *=2;
        }
        return arr;
    }
    public void execute(int[] arr){
        System.out.println(map(arr));
    }
}