package ingredients.Types;

import ingredients.Ingredient;

public class Fruit extends Ingredient {
    public Fruit(String nom, String description)
    {
        super(nom, description, TypeIngredient.FRUIT);
    }

    public Fruit() {
        setTypeIngredient(TypeIngredient.FRUIT);
    }
}
