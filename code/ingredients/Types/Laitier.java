package ingredients.Types;

import ingredients.Ingredient;

public class Laitier extends Ingredient {
    public Laitier(String nom, String description)
    {
        super(nom, description, TypeIngredient.LAITIER);
    }

    public Laitier() {
        setTypeIngredient(TypeIngredient.LAITIER);
    }
}
