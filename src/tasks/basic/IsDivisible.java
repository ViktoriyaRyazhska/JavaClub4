package tasks.basic;

public class IsDivisible {

    public void execute (int wallLength, int pixelSize ){
        System.out.println(isDivisible(wallLength,pixelSize));
    }

    private static boolean isDivisible(int wallLength, int pixelSize) {
        return wallLength % pixelSize == 0;


    }
}
