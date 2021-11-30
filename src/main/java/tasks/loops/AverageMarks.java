package tasks.loops;

public class AverageMarks {

    public static int getAverage(int[] marks){
        int result = 0;

        for (int mark : marks) {
            result += mark;

        }
        return result / marks.length;
    }

    public void execute(int[] marks){
        System.out.println(getAverage(marks));
    }
}
