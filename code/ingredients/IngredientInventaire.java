package ingredients;

import ingredients.exceptions.IngredientException;

public class IngredientInventaire {
    private Ingredient ingredient;
    private double quantite;

    public IngredientInventaire(Ingredient ingredient, double quantite) throws IngredientException {
        this.ingredient = ingredient;
        setQuantite(quantite);
    }

    public Ingredient getIngredient(){
        return this.ingredient;
    }

    public double getQuantite() {
        return quantite;
    }

    public void ajouter(double quantite) throws IngredientException
    {
        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite += quantite;
    }

    public void retirer(double quantite) throws IngredientException
    {
        if (quantite < 0 || this.quantite - quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite -= quantite;
    }

    public void setQuantite(double quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite = quantite;
    }
}
