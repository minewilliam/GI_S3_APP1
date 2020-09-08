package menufact.plats;

import ingredients.IngredientInventaire;
import menufact.exceptions.MenuException;
import menufact.plats.exceptions.PlatException;

import java.util.ArrayList;

public class PlatAuMenu {
    protected int code;
    protected String description;
    protected double prix;
    protected ArrayList<IngredientInventaire> Ingredients;
    private IEtatPlat etat;

    public PlatAuMenu(int code, String description, double prix, ArrayList<IngredientInventaire> Ingredients) {
        this.code = code;
        this.description = description;
        this.prix = prix;
        this.etat = new EtatCommande(this);
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

    /**
     *
     * @param etat l'etat auxquel changer la facture
     */
    public void ChangeState(IEtatPlat etat){
        this.etat = etat;
    }
    /**
     *
     * Permet de changer l'etat à EtatServi
     * @throws PlatException si le plat n'est pas terminer
     */
    public void Servir() throws PlatException {
        etat.Servir();
    }
    /**
     *
     * Permet de changer l'etat à EtatEnPreparation
     * @throws PlatException si le plat est deja servi
     */
    public void Preparer() throws PlatException{
        etat.Preparer();
    }
    /**
     *
     * Permet de changer l'etat à EtatTermine
     * @throws PlatException si le plat est deja servi
     */
    public void EstPret() throws PlatException{
        etat.EstPret();
    }
    /**
     *
     * @return le plat en chaine de charactere
     */
    @Override
    public String toString() {
        return "menufact.plats.PlatAuMenu{" +
                "code=" + code +
                ", description='" + description + '\'' +
                ", prix=" + prix +
                "}\n";
    }
    /**
     *
     * @return la liste d'ingredients
     */
    public ArrayList<IngredientInventaire> getIngredients() {
        return this.Ingredients;
    }
    /**
     *
     * @param ingredients la liste d'ingredients necessaire au plat
     */
    public void setIngredients(ArrayList<IngredientInventaire> ingredients)
    {
        this.Ingredients = ingredients;
    }
    /**
     *
     * @return le code
     */
    public int getCode() {
        return this.code;
    }
    /**
     *
     * @param code le code du plat
     */
    public void setCode(int code) {
        this.code = code;
    }
    /**
     *
     * @return la description du plat
     */
    public String getDescription() {
        return description;
    }
    /**
     *
     * @param description la descriptiond du plat
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     *
     * @return le prix du plat
     */
    public double getPrix() {
        return prix;
    }
    /**
     *
     * @param prix le prix du plat
     */
    public void setPrix(double prix) {
        this.prix = prix;
    }
}
