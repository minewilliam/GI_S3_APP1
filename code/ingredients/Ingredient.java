package ingredients;

import ingredients.Types.TypeIngredient;
import ingredients.exceptions.IngredientException;

public class Ingredient {
    private String nom;
    private String description;
    private TypeIngredient typeIngredient;

    public Ingredient(){};

    public Ingredient(Ingredient ingredient)
    {
        this.nom = ingredient.nom;
        this.description = ingredient.description;
        this.typeIngredient = ingredient.typeIngredient;
    }

    public Ingredient(String nom, String Description, TypeIngredient type)
    {
        this.nom = nom;
        this.description = Description;
        this.typeIngredient = type;
    }
    /**
     *
     * @return le nom de l'ingredient
     */
    public String getNom() {
        return nom;
    }
    /**
     *
     * @param nom le nom de l'ingredient
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     *
     * @return la description de l'ingredient
     */
    public String getDescription() {
        return description;
    }
    /**
     *
     * @param description la description de l'ingredient
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     *
     * @return le type d'ingredient
     */
    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }
    /**
     *
     * @param typeIngredient le type d'ingredient
     */
    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }
}
