package conditions;

public class Conditions_task_10 {
    public static int enough(int cap, int on, int wait){
        if(on + wait > cap) {
            return on + wait - cap;
        }else return 0;
    }
}
