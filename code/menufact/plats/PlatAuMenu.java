package menufact.plats;

import menufact.facture.models.IFacturable;

public class PlatAuMenu implements IFacturable {
    protected int code;
    protected String description;
    protected double prix;

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
    }

    public PlatAuMenu() {
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
