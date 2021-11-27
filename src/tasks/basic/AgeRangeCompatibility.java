package tasks.basic;

public class AgeRangeCompatibility {

    private static String datingRange(int age) {
        double min;
        double max;
        if (age <= 14){
            min = age - 0.10 * age;
            max = age + 0.10 * age;
            return (int)min + "-" + (int) max;
        } else
         min = ((double) age / 2) + 7;
         max = (age - 7) * 2;
        return (int)min + "-" + (int) max;
    }

   public void execute(int age){
       System.out.println(datingRange(age));
   }
}
