package nl.han.bewd.lambdas.reis;

public class FietsVervoerStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        return 40;
    }
}
