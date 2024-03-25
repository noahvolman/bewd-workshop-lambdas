package nl.han.bewd.lambdas.reis;

public class AutoVervoerStrategy implements VervoerStrategy{
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        if (isReisTijdensSpits) {
            return 60;
        } else {
            return 30;
        }
    }
}
