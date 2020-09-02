package menufact.facture.models.impl;

import menufact.facture.models.IFactureEntry;
import menufact.plats.PlatAuMenu;

public class PlatFacturable extends PlatAuMenu implements IFactureEntry {
    private int quantite = 0;

    public PlatFacturable(PlatAuMenu plat, int quantite)
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
