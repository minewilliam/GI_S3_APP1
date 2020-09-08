package menufact.plats;

import menufact.facture.models.IFacturable;
import menufact.plats.exceptions.PlatException;

public class PlatAuMenu implements IFacturable {
    protected int code;
    protected String description;
    protected double prix;
    private EtatPlat etat;

    public PlatAuMenu(int code, String description, double prix) {
        this.code = code;
        this.description = description;
        this.prix = prix;
    }

    public PlatAuMenu(PlatAuMenu plat)
    {
        this.code = plat.code;
        this.description = plat.description;
        this.prix = plat.prix;
        this.etat = new EtatCommande(this);
    }

    public PlatAuMenu() {
    }
    public void ChangeState(EtatPlat etat){
        this.etat = etat;
    }
    public void Servir() throws PlatException {
        etat.Servir();
    }
    public void Preparer() throws PlatException{
        etat.Preparer();
    }
    public void EstPret() throws PlatException{
        etat.EstPret();
    }

    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
