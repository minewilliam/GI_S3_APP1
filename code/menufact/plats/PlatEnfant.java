package menufact.plats;

public class PlatEnfant extends PlatAuMenu{
    private double proportion;

    public PlatEnfant(PlatAuMenu plat, double proportion) {
        super(plat);
        this.proportion = proportion;
    }
    /**
     *
     * @return la proportion du plat
     */
    public double getProportion() {
        return proportion;
    }
    /**
     *
     * @return le plat en chaine de charactere
     */
    @Override
    public String toString() {
        return "PlatEnfant{" +
                "proportion=" + proportion +
                "} " + super.toString();
    }
}
