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
    /**
     *
     * @return le plat en chaine de charactere
     */
    @Override
    public String toString() {
        return "menufact.plats.PlatSante{" +
                super.toString() +
                "kcal=" + kcal +
                ", chol=" + chol +
                ", gras=" + gras +
                "} ";
    }
    /**
     *
     * @return le nombre de kcal
     */
    public double getKcal() {
        return kcal;
    }
    /**
     *
     * @return le nombre de Chol
     */
    public double getChol() {
        return chol;
    }
    /**
     *
     * @return le nombre de gras
     */
    public double getGras() {
        return gras;
    }
}
