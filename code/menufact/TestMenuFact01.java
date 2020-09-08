package menufact;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.Types.TypeIngredient;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatSante;

import java.util.ArrayList;

public class TestMenuFact01 {
    public static void main(String[] args) {

        //Test data:
        Ingredient ingredient1 = new Ingredient("Ravioli", "violi", TypeIngredient.VIANDE);
        Ingredient ingredient2 = new Ingredient("Pomme", "Mcintoch rouge", TypeIngredient.FRUIT);
        Ingredient ingredient3 = new Ingredient("Tomate", "Rouge", TypeIngredient.FRUIT);
        Ingredient ingredient4 = new Ingredient("Porc", "Un Porc Entier", TypeIngredient.VIANDE);
        Ingredient ingredient5 = new Ingredient("Laitue", "Verte", TypeIngredient.LEGUME);
        Ingredient ingredient6 = new Ingredient("Fromage", "Mozzarella", TypeIngredient.LAITIER);
        Ingredient ingredient7 = new Ingredient("Epice", "Mexicaine", TypeIngredient.EPICE);


        try {
            ArrayList<IngredientInventaire> Ingredients1 = new ArrayList<IngredientInventaire>(){
                {
                    add(new IngredientInventaire(ingredient1, 32));
                    add(new IngredientInventaire(ingredient2, 1));
                    add(new IngredientInventaire(ingredient3, 2));
                    add(new IngredientInventaire(ingredient4, 1));
                    add(new IngredientInventaire(ingredient5, 2));
                    add(new IngredientInventaire(ingredient6, 2));
                    add(new IngredientInventaire(ingredient7, 2));
                }
            };

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 4 arguments");
            PlatAuMenu p1 = new PlatAuMenu(0, "Frites sauce", 11.50, Ingredients1);
            System.out.println(p1);

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 3 arguments");
            PlatAuMenu p2 = new PlatAuMenu(1, "Frites", 10.25, Ingredients1);
            System.out.println(p2);

            System.out.println("===menufact.plats.PlatSante Constructeur 5 arguments");
            PlatSante ps1 = new PlatSante(new PlatAuMenu(2, "Salade", 5.25, Ingredients1), 100, 10, 1);
            System.out.println(ps1);

            System.out.println("===menufact.plats.PlatSante Constructeur 5 arguments");
            PlatSante ps2 = new PlatSante(new PlatAuMenu(3, "Salade Cesar", 8.25, Ingredients1), 100, 10, 1);
            System.out.println(ps2);

            System.out.println("===menufact.Menu ajout avec 4 plats");
            Menu menu = new Menu("Menu1");
            menu.ajoute(p1);
            menu.ajoute(p2);
            menu.ajoute(ps1);
            menu.ajoute(ps2);
            System.out.println(menu);

            System.out.println("===menufact.Menu position 1, plat à la position 0");
            menu.position(0);
            System.out.println(menu.platCourant());

            System.out.println("===menufact.Menu position 1, plat à la position suivante 1");
            menu.positionSuivante();
            System.out.println(menu.platCourant());

            System.out.println("== New menufact.facture.Facture");
            Facture facture = new Facture("Ma facture");
            System.out.println(facture);

            System.out.println("== Ajout d'un plat choisie à la facture");
            facture.ajoutePlat(p1);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println("== Ajout d'un plat choisie à la facture");
//            PlatChoisi pch2 = new PlatChoisi(p2, 10);
//            facture.ajoutePlat(pch2);
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println(facture.total());
            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.fermer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.payer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());
        }catch (Exception fe)
        {
            System.out.println(fe.getMessage());
        }

    }
}
