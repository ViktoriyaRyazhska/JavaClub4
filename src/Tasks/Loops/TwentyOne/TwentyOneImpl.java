package Tasks.Loops.TwentyOne;

import java.util.Scanner;

public class TwentyOneImpl implements TwentyOne{
    private int stick = 21;
    private int AI;
    private int player;

    public int getStick() {
        return stick;
    }

    public void setStick(final int stick) {
        this.stick = stick;
    }

    public int getAI() {
        return AI;
    }

    public void setAI(final int AI) {
        this.AI = AI;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(final int player) {
        this.player = player;
    }

    @Override
    public void playGame(final Scanner scanner) {
        System.out.println("Choose how many sticks take(1, 2 or 3): ");
        setAI(1);
        setStick(getStick() - getAI());
        System.out.println("AI takes " + getAI() + " --> " + getStick() + " sticks left");

        while (stick > 0) {
          setPlayer(scanner.nextInt());
           setStick(getStick() - getPlayer());
            System.out.println("Player takes " + getPlayer() + " --> " + getStick() + " sticks left");
            if (stick <= 0) {
                System.out.println("Player loose");
            } else if(stick >= 5){
                setAI(5 - getPlayer());
                setStick(getStick() - getAI());
                System.out.println("AI takes " + getAI() + " --> " + getStick() + " sticks left");
                if (stick <= 0) {
                    System.out.println("AI loose");
                }
            } else{
                setAI(getStick());
                setStick(0);
                System.out.println("AI takes " + getAI() + " --> " + getStick() + " sticks left");
                System.out.println("Player loose");
            }
        }
    }
}
