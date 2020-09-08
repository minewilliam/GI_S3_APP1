package menufact.plats.tests;

import ingredients.IngredientInventaire;
import ingredients.Types.*;
import ingredients.exceptions.IngredientException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class TestPlatAuMenu {

    private static int m_code = 1;
    private static String m_description = "mon plat au menu";
    double m_prix = 9273.99;
    private ArrayList<IngredientInventaire> m_ingredients;

    private PlatAuMenu m_plat;

    private int m_passed = 0;
    private int m_failed = 0;

    public TestPlatAuMenu()
    {
        System.out.println("Executing test suite: " + new Throwable().getStackTrace()[0]);

        Viande ingredient1 = new Viande("Ravioli", "violi");
        Fruit ingredient2 = new Fruit("Pomme", "Mcintoch rouge");
        Fruit ingredient3 = new Fruit("Tomate", "Rouge");
        Viande ingredient4 = new Viande("Porc", "Un Porc Entier");
        Legume ingredient5 = new Legume("Laitue", "Verte");
        Laitier ingredient6 = new Laitier("Fromage", "Mozzarella");
        Epice ingredient7 = new Epice("Epice", "Mexicaine");
        try {
            m_ingredients = new ArrayList<IngredientInventaire>() {
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
        } catch (IngredientException e) {
            e.printStackTrace();
        }
        m_plat = new PlatAuMenu(m_code, m_description,m_prix, m_ingredients);

        TestPlatAuMenu_GetIngredients();
        TestPlatAuMenu_SetIngredients();
        TestPlatAuMenu_GetSetDescription();
        TestPlatAuMenu_GetSetPrix();
        TestPlatAuMenu_GetSetCode();

        System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + " Finished:");
        System.out.println("Passed: "+ m_passed + " Failed: " + m_failed);
    }

    public void TestPlatAuMenu_GetIngredients()
    {
        if(m_plat.getIngredients().size() == 7)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Passed");
            m_passed++;
        }
        else
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
        }
    }

    public void TestPlatAuMenu_SetIngredients()
    {
        Laitier ingredient8 = new Laitier("Fromagio", "Mozzarello");
        try {
            m_ingredients.add(new IngredientInventaire(ingredient8, 1));
        }
        catch (Exception e)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
            return;
        }

        m_plat.setIngredients(m_ingredients);

        if(m_plat.getIngredients().size() == 8)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Passed");
            m_passed++;
        }
        else
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
        }
    }

    public void TestPlatAuMenu_GetSetDescription()
    {
        boolean pass = true;
        if(m_plat.getDescription() != m_description) pass = false;

        m_plat.setDescription("my new description");
        if(m_plat.getDescription() != "my new description") pass = false;

        if(pass)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Passed");
            m_passed++;
        }
        else
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
        }
    }

    public void TestPlatAuMenu_GetSetPrix()
    {
        boolean pass = true;
        if(m_plat.getPrix() != m_prix) pass = false;

        m_plat.setPrix(1234);
        if(m_plat.getPrix() != 1234) pass = false;

        if(pass)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Passed");
            m_passed++;
        }
        else
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
        }
    }

    public void TestPlatAuMenu_GetSetCode()
    {
        boolean pass = true;
        if(m_plat.getCode() != m_code) pass = false;

        m_plat.setCode(1234);
        if(m_plat.getCode() != 1234) pass = false;

        if(pass)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Passed");
            m_passed++;
        }
        else
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
        }
    }
}
