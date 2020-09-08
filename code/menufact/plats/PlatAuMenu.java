package menufact.plats;

import ingredients.IngredientInventaire;
import menufact.facture.models.IFacturable;
import menufact.plats.exceptions.PlatException;

import java.util.ArrayList;

public class PlatAuMenu implements IFacturable {
    protected int code;
    protected String description;
    protected double prix;
    protected ArrayList<IngredientInventaire> Ingredients;
    protected EtatPlat etat;

    public PlatAuMenu(int code, String description, double prix, ArrayList<IngredientInventaire> Ingredients) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.Ingredients = Ingredients;
    }

    public PlatAuMenu(PlatAuMenu plat)
    {
        this.code = plat.code;
        this.description = plat.description;
        this.prix = plat.prix;
        this.etat = new EtatCommande(this);
        this.Ingredients = plat.Ingredients;
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

    public ArrayList<IngredientInventaire> getIngredients() {
        return this.Ingredients;
    }

    public void setIngredients(ArrayList<IngredientInventaire> ingredients)
    {
        this.Ingredients = ingredients;
    }

    public int getCode() {
        return this.code;
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
