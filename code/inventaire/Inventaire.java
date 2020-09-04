package inventaire;

import ingredients.IngredientInventaire;
import ingredients.exceptions.IngredientException;
import java.util.ArrayList;

public class Inventaire {
    private ArrayList<IngredientInventaire> lesIngredients = new ArrayList<IngredientInventaire>();
    private Inventaire inventaire;

    private Inventaire(){

    }

    public void ajouter (int signNum, IngredientInventaire ingredientInventaire) throws IngredientException
    {
        if(signNum != 1 && signNum != -1)
            signNum = 1;

        boolean found = false;
        for(int i=0;i<lesIngredients.size();i++){
            if(lesIngredients.get(i).getIngredient().getNom().equals(ingredientInventaire.getIngredient().getNom())){
                lesIngredients.get(i).setQuantite(lesIngredients.get(i).getQuantite() + signNum*ingredientInventaire.getQuantite());
                found = true;
            }
        }
        if(!found && signNum == 1){
            lesIngredients.add(ingredientInventaire);
        }
        else if(!found && signNum == -1){
            throw new IngredientException("Il n'est pas possible d'avoir une quantité negative");
        }

    }

    public Inventaire getInstance(){
        if(inventaire == null) {
            inventaire = new Inventaire();
        }
        return inventaire;
    }

}
