package menufact.plats.tests;

import ingredients.IngredientInventaire;
import ingredients.Types.Fruit;
import ingredients.Types.Viande;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatSante;

import java.util.ArrayList;

public class TestPlatSante {

    private int m_passed = 0;
    private int m_failed = 0;

    Viande ingredient1 = new Viande("Ravioli", "violi");
    Fruit ingredient2 = new Fruit("Pomme", "Mcintoch rouge");

    public TestPlatSante(){

        System.out.println("Executing test suite: " + new Throwable().getStackTrace()[0]);
        TestPlatSante_GetKcalCholGras();
        System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + " Finished:");
        System.out.println("Passed: "+ m_passed + " Failed: " + m_failed);

    }
    private void TestPlatSante_GetKcalCholGras(){
        ArrayList<IngredientInventaire> array = new ArrayList<IngredientInventaire>();
        try {
            array.add(new IngredientInventaire(ingredient1, 2));
            array.add(new IngredientInventaire(ingredient2, 4));

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        PlatAuMenu platmenu = new PlatAuMenu(29, "Saumon", 20, array);
        PlatSante platSante = new PlatSante(platmenu, 100, 40, 60);

        if(platSante.getKcal() != 100 || platSante.getGras() != 60 || platSante.getChol() != 40){
            System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + " Failed");
            m_failed++;
        }
        else{
            System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + " Passed");
            m_passed++;
        }

    }

}
