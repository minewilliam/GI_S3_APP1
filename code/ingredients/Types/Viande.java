package ingredients.Types;

import ingredients.Ingredient;

public class Viande extends Ingredient {
    public Viande(String nom, String description)
    {
        super(nom, description, TypeIngredient.VIANDE);
    }

    public Viande() {setTypeIngredient(TypeIngredient.VIANDE);}
}
