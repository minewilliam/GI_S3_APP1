package menufact.plats;

import menufact.facture.models.IFactureEntry;

public class PlatChoisi extends PlatAuMenu implements IFactureEntry {
    private int quantite;

    public PlatChoisi(PlatAuMenu plat, int quantite)
    {
        super(plat);
        this.quantite = quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getQuantite() {
        return this.quantite;
    }
}