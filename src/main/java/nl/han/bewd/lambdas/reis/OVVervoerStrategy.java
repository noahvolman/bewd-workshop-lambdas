package nl.han.bewd.lambdas.reis;

import java.util.Random;

// OV-reistijd kan van alles zijn.
public class OVVervoerStrategy implements VervoerStrategy{
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        Random randomNumberGenerator = new Random();
        return randomNumberGenerator.nextInt(90);
    }
}
