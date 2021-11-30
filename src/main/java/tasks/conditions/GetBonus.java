
package tasks.conditions;
public class GetBonus {
    public void execute(final int salary, final boolean bonus){
        System.out.println(bonusTime( salary, bonus));
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        if (bonus) {
            return "\u00A3" + salary * 10;
        } else {
            return "\u00A3" + salary;
        }
    }
}