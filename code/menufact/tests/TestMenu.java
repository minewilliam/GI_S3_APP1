package menufact.tests;

import ingredients.IngredientInventaire;
import menufact.Menu;
import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class TestMenu {

    private static String m_description = "The finest menu in the seven kingdoms!";
    private static PlatAuMenu m_plat1 = new PlatAuMenu(0, "desc1", 10.2, new ArrayList<IngredientInventaire>());
    private static PlatAuMenu m_plat2 = new PlatAuMenu(1, "desc2", 10.5, new ArrayList<IngredientInventaire>());
    private static PlatAuMenu m_plat3 = new PlatAuMenu(2, "desc3", 15.9, new ArrayList<IngredientInventaire>());

    private int m_passed = 0;
    private int m_failed = 0;

    public TestMenu(){
        System.out.println("Executing test suite: " + new Throwable().getStackTrace()[0]);

        TestMenu_HappyPath();
        TestMenu_IterationDansLesPlats();
        TestMenu_Iteration_DepasseNombreDePlats_DevraitThrow();

        System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + " Finished:");
        System.out.println("Passed: "+ m_passed + " Failed: " + m_failed);
    }

    private void TestMenu_HappyPath()
    {
        Menu m = new Menu(m_description);
        m.ajoute(m_plat1);
        if(m.platCourant() == m_plat1)
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

    private void TestMenu_IterationDansLesPlats()
    {
        Menu m = new Menu(m_description);
        m.ajoute(m_plat1);
        m.ajoute(m_plat2);
        m.ajoute(m_plat3);

        boolean pass = true;

        if(m.platCourant() != m_plat1) pass = false;

        try {
            m.positionSuivante();
        }
        catch(MenuException e)
        {
            pass = false;
        }

        if(m.platCourant() != m_plat2) pass = false;

        m.position(2);

        if(m.platCourant() != m_plat3) pass = false;

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

    private void TestMenu_Iteration_DepasseNombreDePlats_DevraitThrow()
    {
        Menu m = new Menu(m_description);
        m.ajoute(m_plat1);

        boolean pass = true;

        try {
            m.positionSuivante();
            pass = false;
        }
        catch(MenuException e)
        {

        }

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