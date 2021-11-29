package tasks.conditions;
public class OppositesAttract {

    private static boolean isLove(final int flower1, final int flower2) {
        boolean flag =false;
        if(flower1%2==0 & flower2%2==1 ^ flower1%2==1 & flower2%2==0){
            flag = true;
        }
        return flag;
    }

    public void execute(int flower1, int flower2){
        System.out.println(isLove(flower1, flower2));
    }
}