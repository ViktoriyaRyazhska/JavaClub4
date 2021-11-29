package tasks.basic;

public class IsDivisible {

    public void execute (int wallLength, int pixelSize ) throws Exception {
        System.out.println(isDivisible(wallLength,pixelSize));
    }

    public static boolean isDivisible(int wallLength, int pixelSize)  {
        try {
            if(pixelSize ==0){
                System.out.println("Division for 0");
            }
        }catch (NullPointerException e){
            e.printStackTrace();
        }
        return wallLength % pixelSize == 0;

    }
}
