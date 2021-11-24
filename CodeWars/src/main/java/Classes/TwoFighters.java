package Classes;

public class TwoFighters {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";

        while (fighter1.health > 0 && fighter2.health > 0) {
            if (fighter1.name == firstAttacker) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0) {
                    winner = fighter1.name;
                    break;
                } else {
                    fighter1.health -= fighter2.damagePerAttack;
                    if (fighter1.health <= 0) {
                        winner = fighter2.name;
                        break;
                    }
                }
            } else {
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0) {
                    winner = fighter2.name;
                    break;
                } else {
                    fighter2.health -= fighter1.damagePerAttack;
                    if (fighter2.health <= 0) {
                        winner = fighter1.name;
                        break;
                    }
                }
            }
        }
        return winner;
    }

    public static class Fighter {
        public int health;
        public String name;
        public int damagePerAttack;

        public Fighter(int health, String name, int damagePerAttack) {
            this.health = health;
            this.name = name;
            this.damagePerAttack = damagePerAttack;
        }
    }
}

