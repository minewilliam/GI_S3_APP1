package menufact.plats;;

public class PlatSante extends PlatAuMenu {
    private double kcal;
    private double chol;
    private double gras;

    public PlatSante(PlatAuMenu plat, double kcal, double chol, double gras) {
        super(plat);
        this.kcal = kcal;
        this.chol = chol;
        this.gras = gras;
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatSante{" +
                super.toString() +
                "kcal=" + kcal +
                ", chol=" + chol +
                ", gras=" + gras +
                "} ";
    }

    public double getKcal() {
        return kcal;
    }

    public double getChol() {
        return chol;
    }

    public double getGras() {
        return gras;
    }
}
