package menufact;

import ingredients.IngredientInventaire;
import ingredients.Types.*;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.PlatEnfant;
import menufact.plats.PlatSante;

import java.util.ArrayList;

public class TestMenuFact01 {
    public static void main(String[] args) {

        //Test data:
        Viande ingredient1 = new Viande("Ravioli", "violi");
        Fruit ingredient2 = new Fruit("Pomme", "Mcintoch rouge");
        Fruit ingredient3 = new Fruit("Tomate", "Rouge");
        Viande ingredient4 = new Viande("Porc", "Un Porc Entier");
        Legume ingredient5 = new Legume("Laitue", "Verte");
        Laitier ingredient6 = new Laitier("Fromage", "Mozzarella");
        Epice ingredient7 = new Epice("Epice", "Mexicaine");
        //end Test data

        try {
            //Test data:
            ArrayList<IngredientInventaire> Ingredients1 = new ArrayList<IngredientInventaire>(){
                {
                    add(new IngredientInventaire(ingredient1, 32));
                    add(new IngredientInventaire(ingredient2, 1));
                    add(new IngredientInventaire(ingredient3, 2));
                    add(new IngredientInventaire(ingredient4, 1));
                    add(new IngredientInventaire(ingredient5, 2.1));
                    add(new IngredientInventaire(ingredient6, 2.5));
                    add(new IngredientInventaire(ingredient7, 2));
                }
            };
            //end Test data

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 4 arguments");
            PlatAuMenu p1 = new PlatAuMenu(0, "Frites sauce", 11.50, Ingredients1);
            System.out.println(p1);

            System.out.println("===menufact.plats.PlatAuMenu Constructeur 4 arguments");
            PlatAuMenu p2 = new PlatAuMenu(1, "Frites", 10.25, Ingredients1);
            System.out.println(p2);

            System.out.println("===menufact.plats.PlatSante Constructeur 4 arguments");
            PlatSante ps1 = new PlatSante(new PlatAuMenu(2, "Salade", 5.25, Ingredients1), 100, 10, 1);
            System.out.println(ps1);

            System.out.println("===menufact.plats.PlatSante Constructeur 4 arguments");
            PlatSante ps2 = new PlatSante(new PlatAuMenu(3, "Salade Cesar", 8.25, Ingredients1), 100, 10, 1);
            System.out.println(ps2);

            System.out.println("===menufact.plats.PlatEnfant Constructeur 4 arguments");
            PlatEnfant pe1 = new PlatEnfant(new PlatAuMenu(3, "Salade Cesar", 8.25, Ingredients1),0.5);
            System.out.println(pe1);

            System.out.println("===menufact.Menu ajout avec 5 plats");
            Menu menu = new Menu("Menu1");
            menu.ajoute(p1);
            menu.ajoute(p2);
            menu.ajoute(ps1);
            menu.ajoute(ps2);
            menu.ajoute(pe1);
            System.out.println(menu);

            System.out.println("===menufact.Menu position 0");
            menu.position(0);
            System.out.println(menu.platCourant());

            System.out.println("===menufact.Menu position suivante (1)");
            menu.positionSuivante();
            System.out.println(menu.platCourant());

            System.out.println("===menufact.Menu position precedente (0)");
            menu.positionPrecedente();
            System.out.println(menu.platCourant());

            System.out.println("===New menufact.facture.Facture");
            Facture facture = new Facture("Ma facture");
            System.out.println(facture);

            System.out.println("===Ajout d'un plat choisi à la facture");
            facture.ajoutePlat(new PlatChoisi(p1, 1));
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println("===Ajout d'un plat choisi à la facture");
            facture.ajoutePlat(new PlatChoisi(ps2, 2));
            System.out.println(facture);
            System.out.println(facture.sousTotal());

            System.out.println(facture.total());
            facture.ouvrir();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.fermer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());

            facture.payer();
            System.out.println(facture);
            System.out.println("Etat = " + facture.getEtat());
        }catch (Exception fe)
        {
            System.out.println(fe.getMessage());
        }

    }
}
