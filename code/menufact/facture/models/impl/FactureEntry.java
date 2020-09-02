package menufact.facture.models.impl;

import menufact.facture.models.IFacturable;
import menufact.facture.models.IFactureEntry;

//Extension class for IFacturable objects
public class FactureEntry<T extends IFacturable> implements IFactureEntry{
    private int quantite = 0;
    private T entry;

    public FactureEntry(T entry, int quantite)
    {
        this.entry = entry;
        this.quantite = quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getQuantite() {
        return this.quantite;
    }

    public void setDescription(String description) {
        entry.setDescription(description);
    }

    public String getDescription() {
        return entry.getDescription();
    }

    public void setCode(int code) {
        entry.setCode(code);
    }

    public int getCode() {
        return entry.getCode();
    }

    public void setPrix(double prix) {
        entry.setPrix(prix);
    }

    public double getPrix() {
        return entry.getPrix();
    }
}
