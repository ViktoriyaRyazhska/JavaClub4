package Loops;

public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int num = 0;
        for(int i=0; i<arrayOfSheeps.length; i++){
            if(arrayOfSheeps [i] == true){
                num++;
            }
        }
        return num;
    }
}
