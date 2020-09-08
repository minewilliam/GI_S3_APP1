package menufact.plats.tests;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.Types.*;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;

public class TestPlatChoisi {

    private int m_passed = 0;
    private int m_failed = 0;
    Viande ingredient1 = new Viande("Ravioli", "violi");

    public TestPlatChoisi(){

        System.out.println("Executing test suite: " + new Throwable().getStackTrace()[0]);
        TestPlatChoisi_GetSetQuantite();
        System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + " Finished:");
        System.out.println("Passed: "+ m_passed + " Failed: " + m_failed);

    }
    private void TestPlatChoisi_GetSetQuantite(){
        ArrayList<IngredientInventaire> array = new ArrayList<IngredientInventaire>();
        try {
            array.add(new IngredientInventaire(ingredient1, 2));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        PlatAuMenu platmenu = new PlatAuMenu(29, "Saumon", 20, array);
        PlatChoisi platChoisi = new PlatChoisi(platmenu, 2);
        platChoisi.setQuantite(8);
        if(platChoisi.getQuantite() == 8){
            System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " Passed");
            m_passed++;
        }
        else{
            System.out.println(new Throwable().getStackTrace()[0].getMethodName() + " Failed");
            m_failed++;
        }

    }

}
