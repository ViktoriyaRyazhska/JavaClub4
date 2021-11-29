package tasks.loops;

public class Counter {
    private int countSheeps(boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i =0; i< arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i]){
                count++;
            }
        }
        return count;
    }

    public void execute(boolean[] arrayOfSheeps){
        System.out.println(countSheeps(arrayOfSheeps));
    }
}