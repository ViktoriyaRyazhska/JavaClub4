package application.tasks.Conditions;

public class OppositesAttract {
    public static boolean isLove(final int flower1, final int flower2) {
            boolean point =false;
            if(flower1%2==0 & flower2%2==1 ^ flower1%2==1 & flower2%2==0){
                point = true;
            }
        System.out.println("Love");
            return point;
    }
}

