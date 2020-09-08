package ingredients.Types;

import ingredients.Ingredient;

public class Legume extends Ingredient {
    public Legume(String nom, String description)
    {
        super(nom, description, TypeIngredient.LEGUME);
    }

    public Legume() {
        setTypeIngredient(TypeIngredient.LEGUME);
    }
}
