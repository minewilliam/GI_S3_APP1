package menufact.plats;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import jdk.nashorn.internal.lookup.Lookup;
import menufact.facture.models.IFacturable;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class PlatAuMenu implements IFacturable {
    protected int code;
    protected String description;
    protected double prix;
    protected ArrayList<IngredientInventaire> Ingredients;

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
        this.Ingredients = plat.Ingredients;
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
