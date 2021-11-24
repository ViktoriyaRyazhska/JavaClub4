public class Fight {

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        String winner = "";
        boolean firstAtack = false;

        if(firstAttacker == fighter1.name){
            firstAtack = true;
        }

        while(winner == ""){
            if(firstAtack){
                if(fighter1.health > 0){
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                    firstAtack=!firstAtack;
                } else {
                    winner = fighter2.name;
                }
            } else {
                if(fighter2.health>0){
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                    firstAtack=!firstAtack;
                } else {
                    winner = fighter1.name;
                }
            }
        }
        return winner;
    }
}

