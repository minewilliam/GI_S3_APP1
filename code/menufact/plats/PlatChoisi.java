package menufact.plats;

public class PlatChoisi extends PlatAuMenu {
    private int quantite;

    public PlatChoisi(PlatAuMenu plat, int quantite)
    {
        super(plat);
        this.quantite = quantite;
    }
    /**
     *
     * @param quantite la quantite de plat
     */
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    /**
     *
     * @return la quantite de plat
     */
    public int getQuantite() {
        return this.quantite;
    }
}