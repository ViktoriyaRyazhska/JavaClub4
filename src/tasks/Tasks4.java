package tasks;

public class Task4 {
    public void execute (int wallLength, int pixelSize ){
        System.out.println(isDivisible(wallLength,pixelSize));
    }
    
 public static boolean isDivisible(int wallLength, int pixelSize) {
      if (wallLength % pixelSize ==0){
           return true;
       }else{
          return false;
       }
  }

}
