package Conditions;

public class WillBeEnoughSpace {
    public static int enough(int cap, int on, int wait){
        return cap>=on+wait ? 0 : on-wait<0 ? (on-wait)*-1 : on-wait ;
    }
}

