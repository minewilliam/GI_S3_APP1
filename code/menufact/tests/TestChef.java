package menufact.tests;

import ingredients.IngredientInventaire;
import menufact.Chef;
import menufact.facture.Facture;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;

import java.util.ArrayList;

public class TestChef {

    private static class m_ChefMock extends Chef{
        public int update_didReceive = 0;

        public m_ChefMock(String nom) {
            super(nom);
        }

        @Override
        public void update(PlatChoisi p)
        {
            update_didReceive++;
        }
    }

    private static PlatAuMenu m_plat1 = new PlatAuMenu(0, "desc1", 10.2, new ArrayList<IngredientInventaire>());
    private static PlatChoisi m_platChoisi1 = new PlatChoisi(m_plat1, 10);

    private Facture m_facture = new Facture("ma facture");
    private m_ChefMock m_chef1 = new m_ChefMock("Bernard");

    private int m_passed = 0;
    private int m_failed = 0;

    public TestChef()
    {
        System.out.println("Executing test suite: " + new Throwable().getStackTrace()[0]);

        m_facture.ajouteChef(m_chef1);
        
        TestChef_UpdateFacture_DevraitUpdateChefs();

        System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + " Finished:");
        System.out.println("Passed: "+ m_passed + " Failed: " + m_failed);
    }

    private void TestChef_UpdateFacture_DevraitUpdateChefs()
    {
        m_facture.update(m_platChoisi1);

        if(m_chef1.update_didReceive == 1)
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
