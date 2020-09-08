package menufact.plats.tests;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.Types.*;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;

public class TestPlat {

    private int m_passed = 0;
    private int m_failed = 0;
    Viande ingredient1 = new Viande("Ravioli", "violi");
    Fruit ingredient2 = new Fruit("Pomme", "Mcintoch rouge");
    Fruit ingredient3 = new Fruit("Tomate", "Rouge");
    Viande ingredient4 = new Viande("Porc", "Un Porc Entier");
    Legume ingredient5 = new Legume("Laitue", "Verte");
    Laitier ingredient6 = new Laitier("Fromage", "Mozzarella");
    Epice ingredient7 = new Epice("Epice", "Mexicaine");

    public TestPlat(){

        System.out.println("Executing test suite: " + new Throwable().getStackTrace()[0]);



    }
    private void TestPlat_PlatChoisi_GetSetQuantite(){
        ArrayList<IngredientInventaire> array = new ArrayList<IngredientInventaire>();
        try {
            array.add(new IngredientInventaire(ingredient1, 2));
        }
        catch (Exception e){

        }
        PlatAuMenu platmenu = new PlatAuMenu(29, "Saumon", 20, array);
        PlatChoisi platChoisi = new PlatChoisi(platmenu, 2);

    }

}
