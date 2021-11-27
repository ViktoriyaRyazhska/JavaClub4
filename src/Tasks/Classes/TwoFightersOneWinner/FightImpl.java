package Tasks.Classes.TwoFightersOneWinner;

public class FightImpl implements Fight {

    @Override
    public String declareWinner(final TwoFightersOneWinner fighter1, final TwoFightersOneWinner fighter2) {
        if (firsAttack() == 2) {
            while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
                fighter1.setHealth(fighter1.getHealth() - fighter2.getDamagePerAttack());
                if (fighter1.getHealth() <= 0) {
                    return fighter2.getName();
                }
                fighter2.setHealth(fighter2.getHealth() - fighter1.getDamagePerAttack());
                if (fighter2.getHealth() <= 0) {
                    return fighter1.getName();
                }
            }
        } else {
            while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
                fighter2.setHealth(fighter2.getHealth() - fighter1.getDamagePerAttack());
                if (fighter2.getHealth() <= 0) {
                    return fighter1.getName();
                }
                fighter1.setHealth(fighter1.getHealth() - fighter2.getDamagePerAttack());
                if (fighter1.getHealth() <= 0) {
                    return fighter2.getName();
                }
            }
        }
        return "";
    }

    @Override
    public int firsAttack() {
        return (int) ((Math.random() * (2 - 1)) + 1);
    }
}