package Tasks.Classes.TwoFightersOneWinner;

import java.util.Scanner;

public class TwoFightersOneWinner {
    private String name;
    private int health;
    private int damagePerAttack;

    public TwoFightersOneWinner(final Scanner scanner) {
        setName(scanner.nextLine());
        setHealth(scanner.nextInt());
        setDamagePerAttack(scanner.nextInt());
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if (!name.isEmpty() && name.matches("\\b[A-Z][a-z]*\\b")) {
            this.name = name;
        } else {
            this.name = "Viking";
        }
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(final int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(final int damagePerAttack) {
       this.damagePerAttack = damagePerAttack;
    }

}

