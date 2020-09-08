package ingredients;

import ingredients.exceptions.IngredientException;

public class IngredientInventaire {
    private Ingredient ingredient;
    private double quantite;

    public IngredientInventaire(Ingredient ingredient, double quantite) throws IngredientException {
        this.ingredient = ingredient;
        setQuantite(quantite);
    }
    /**
     *
     * @return l'ingredient
     */
    public Ingredient getIngredient(){
        return this.ingredient;
    }
    /**
     *
     * @return la quantite
     */
    public double getQuantite() {
        return quantite;
    }
    /**
     *
     * @param  quantite la quantite a ajouter
     */
    public void ajouter(double quantite) throws IngredientException
    {
        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite += quantite;
    }
    /**
     *
     * @param  quantite la quantite a retirer
     */
    public void retirer(double quantite) throws IngredientException
    {
        if (quantite < 0 || this.quantite - quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite -= quantite;
    }
    /**
     *
     * @param quantite la quantite de l'ingredient
     */
    public void setQuantite(double quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite = quantite;
    }
}
