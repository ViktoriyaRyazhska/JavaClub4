package tasks.loops;

public class Counter {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i =0; i< arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i]){
                count++;
            }
        }
        return count;
    }

    public void execute(Boolean[] arrayOfSheeps){
        System.out.println(countSheeps(arrayOfSheeps));
    }
}