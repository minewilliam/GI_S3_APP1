package menufact.plats;

import menufact.facture.models.IFactureEntry;
import menufact.plats.PlatAuMenu;

public class PlatChoisi extends PlatAuMenu implements IFactureEntry {
    private int quantite;

    public PlatChoisi(int code, String description, double prix)
    {
        super(code, description, prix);
        this.quantite = 0;
    }

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