package nl.han.bewd.lambdas;

import nl.han.bewd.lambdas.reis.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buiten spits met fiets");
        Reis mijnReis = new Reis(false);
        VervoerStrategy vervoer = new FietsVervoerStrategy();
        mijnReis.simuleerReis(vervoer);

        System.out.println("Tijdens de spits");
        mijnReis.setSpits(true);
        mijnReis.simuleerReis(vervoer);                   // Met fiets
        mijnReis.simuleerReis(new AutoVervoerStrategy()); // Met auto
        mijnReis.simuleerReis(new OVVervoerStrategy());   // Met OV


        System.out.println("Met <nieuw> vervoer (Stap 2)  ");
        System.out.println("TODO:");

        System.out.println("Met <nieuw> vervoer, lambda edition! (Stap 5)");
        System.out.println("TODO:");
        // Voorbeeld uitwerking 1 (geavanceerd met elvis)
        mijnReis.simuleerReis((s) -> s ? 20000 : 1000);

        // Voorbeeld uitwerking 2 (vergelijkbaar met OVVervoer)
        mijnReis.simuleerReis((s) -> {
                Random randomNumberGenerator = new Random();
                return randomNumberGenerator.nextInt(2000);
                }
        );
    }
}