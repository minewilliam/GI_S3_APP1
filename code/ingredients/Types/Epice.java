package ingredients.Types;

import ingredients.Ingredient;

public class Epice extends Ingredient {
    public Epice(String nom, String description)
    {
        super(nom, description, TypeIngredient.EPICE);
    }

    public Epice() {
        setTypeIngredient(TypeIngredient.EPICE);
    }
}
