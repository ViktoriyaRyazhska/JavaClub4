package application;

import application.tasks.Conditions.DoIGetBonus;
import application.tasks.basic.*;

public class Main {
    public static void main(String[] args) {
        UnderPressure one = new UnderPressure();
        one.one();

        System.out.println(PixelArtPlanning.isDivisible(4050,27));

        System.out.println(JennySecretMessage.greet("Johnny"));

        System.out.println(ConvertToBinary.convertToBinary(117));

        System.out.println(GrassHopper.weatherInfo(23));

        System.out.println(DoIGetBonus.bonusTime(1000,true));
    }
}
