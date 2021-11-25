package Classes.TwoFightersOneWinner;

public class TwoFightersOneWinner {

    public String name;
    public int health;
    public int damagePerAttack;

    public TwoFightersOneWinner(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static class Fight {

        public static String declareWinner(TwoFightersOneWinner fighter1, TwoFightersOneWinner fighter2, String firstAttacker) {

            if (firstAttacker.equals(fighter2.name)) {

                while (fighter1.health > 0 && fighter2.health > 0) {
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                    if (fighter1.health <= 0) return fighter2.name;
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                    if (fighter2.health <= 0) return fighter1.name;
                }
            } else {
                while (fighter1.health > 0 && fighter2.health > 0) {
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                    if (fighter2.health <= 0) return fighter1.name;
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                    if (fighter1.health <= 0) return fighter2.name;
                }
            }
            return "";
        }

        public static void main(String[] args) {
            TwoFightersOneWinner fighter1 = new TwoFightersOneWinner("Cossack", 8, 5);
            TwoFightersOneWinner fighter2 = new TwoFightersOneWinner("Viking", 10, 3);
            System.out.println(declareWinner(fighter1, fighter2, fighter1.name));
        }
    }
}

