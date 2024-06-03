package nl.han.bewd.lambdas.reis;

public class Reis {
    boolean isSpits;

    public boolean isSpits() {
        return isSpits;
    }

    public void setSpits(boolean spits) {
        isSpits = spits;
    }

    public Reis(boolean isSpits) {
        this.isSpits = isSpits;
    }

    public void simuleerReis(VervoerStrategy vervoer) {
        // Teken het geheugenmodel op dit moment
        System.out.println("Reis " + getSpitsText() + ", duurt " + vervoer.berekenReistijd(isSpits()) + " minuten");
    }

    private String getSpitsText() {
        if (isSpits) return "wel tijdens de spits";
        return "niet tijdens de spits";
    }
}
