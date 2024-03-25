package nl.han.bewd.lambdas.reis;

public class Reis {

    VervoerStrategy vervoerMiddel;

    boolean isSpits;

    public boolean isSpits() {
        return isSpits;
    }

    public void setSpits(boolean spits) {
        isSpits = spits;
    }

    public Reis() {
        // Standaard vervoer is fiets
        this.isSpits = false;
        this.vervoerMiddel = new FietsVervoerStrategy();
    }

    public Reis(boolean isSpits, VervoerStrategy vervoerMiddel) {
        this.isSpits = isSpits;
        this.vervoerMiddel = vervoerMiddel;
    }

    public void setVervoerMiddel(VervoerStrategy vervoerMiddel) {
        this.vervoerMiddel = vervoerMiddel;
    }

    public void simuleerReis() {
        System.out.println("Reis " + getSpitsText() + " duurt " + vervoerMiddel.berekenReistijd(isSpits()) + " minuten");
    }

    private String getSpitsText() {
        if (isSpits) return "wel tijdens de spits";
        return "niet tijdens de spits";
    }
}
