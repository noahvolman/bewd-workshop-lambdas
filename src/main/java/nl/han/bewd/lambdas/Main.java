package nl.han.bewd.lambdas;

import nl.han.bewd.lambdas.reis.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Spitsreizen
        Reis mijnReis = new Reis();
        mijnReis.simuleerReis();
        mijnReis.setSpits(true);
        mijnReis.setVervoerMiddel(new AutoVervoerStrategy());
        mijnReis.simuleerReis();
        mijnReis.setVervoerMiddel(new OVVervoerStrategy());
        mijnReis.simuleerReis();
    }
}