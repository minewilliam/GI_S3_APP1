package ingredients;

import ingredients.Types.TypeIngredient;

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TypeIngredient getTypeIngredient() {
        return typeIngredient;
    }

    public void setTypeIngredient(TypeIngredient typeIngredient) {
        this.typeIngredient = typeIngredient;
    }
}
