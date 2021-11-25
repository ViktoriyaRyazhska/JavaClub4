public class Bob {
    public static int enough(int cap, int on, int wait){
        if (cap <= (on + wait))
            return wait - (cap - on);
        else
            return 0;
    }
}