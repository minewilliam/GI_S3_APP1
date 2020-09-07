package ingredients;

import ingredients.exceptions.IngredientException;

public class IngredientInventaire {
    private Ingredient ingredient;
    private int quantite;

    public IngredientInventaire(Ingredient ingredient, int quantite) throws IngredientException {
        this.ingredient = ingredient;
        setQuantite(quantite);
    }
    public Ingredient getIngredient(){
        return this.ingredient;
    }
    public int getQuantite() {
        return quantite;
    }

    public void ajouter(int quantite) throws IngredientException
    {
        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite += quantite;
    }

    public void retirer(int quantite) throws IngredientException
    {
        if (quantite < 0 || this.quantite - quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite -= quantite;
    }

    public void setQuantite(int quantite) throws IngredientException{

        if (quantite < 0)
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        this.quantite = quantite;
    }
}
