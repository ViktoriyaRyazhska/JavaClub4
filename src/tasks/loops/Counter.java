package tasks.loops;

public class Counter {
    private int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for(int i =0; i< arrayOfSheeps.length; i++){
            if(arrayOfSheeps[i] == true){
                count++;
            }
        }
        return count;
    }

    public void execute(Boolean[] arrayOfSheeps){
        System.out.println(countSheeps(arrayOfSheeps));
    }
}