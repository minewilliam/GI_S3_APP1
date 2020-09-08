package inventaire;

import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import java.util.Hashtable;

public class Inventaire {
    private Hashtable<String, IngredientInventaire> lesIngredients = new Hashtable<String, IngredientInventaire>();
    private static Inventaire inventaire;

    private Inventaire(){

    }

    public void ajouter (IngredientInventaire ingredientInventaire) throws IngredientException
    {
        String inventaireKey = ingredientInventaire.getIngredient().getNom();

        if(lesIngredients.containsKey(inventaireKey))
            lesIngredients.get(inventaireKey).ajouter(ingredientInventaire.getQuantite());
        else
            lesIngredients.put(inventaireKey, ingredientInventaire);
    }

    public void retirer (IngredientInventaire ingredientInventaire) throws IngredientException
    {
        String inventaireKey = ingredientInventaire.getIngredient().getNom();

        if(lesIngredients.containsKey(inventaireKey))
            lesIngredients.get(inventaireKey).retirer(ingredientInventaire.getQuantite());
        else
            throw new IngredientException("Cet ingrédient n'est pas dans l'inventaire");
    }
    public double getQuantite(String ingredientName){
        if(lesIngredients.contains(ingredientName))
            return lesIngredients.get(ingredientName).getQuantite();
        else
            return 0;
    }


    public static Inventaire getInstance(){
        if(inventaire == null) {
            inventaire = new Inventaire();
        }
        return inventaire;
    }

}
