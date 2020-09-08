package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class TestFacture {

    private int m_passed = 0;
    private int m_failed = 0;

    public TestFacture()
    {
        System.out.println("Executing test suite: " + new Throwable().getStackTrace()[0]);

        TestFacture_Constructor_EtatInitial_Ouverte();
        TestFacture_ChangerEtat_Ouvert_Ferme_Ouvert();
        TestFacture_ChangerEtat_Ouvert_Payer_DevraitThrow();
        TestFacture_ChangerEtat_Ouvert_Ferme_Payer();
        TestFacture_ChangerEtat_Ouvert_Payer_Ouvert_DevraitThrow();
        TestFacture_ChangerEtat_Ouvert_Payer_Fermer_DevraitThrow();

        System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + " Finished:");
        System.out.println("Passed: "+ m_passed + " Failed: " + m_failed);
    }

    private void TestFacture_Constructor_EtatInitial_Ouverte()
    {
        Facture facture = new Facture("ma facture");
        if(facture.getEtat() instanceof EtatOuverte)
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

    private void TestFacture_ChangerEtat_Ouvert_Ferme_Ouvert()
    {
        Facture facture = new Facture("ma facture");

        try {
            facture.fermer();
            facture.ouvrir();

            if(facture.getEtat() instanceof EtatOuverte) {
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

        } catch (FactureException e) {

            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed with: " + e.getMessage());
            m_failed++;
        }
    }

    private void TestFacture_ChangerEtat_Ouvert_Payer_DevraitThrow()
    {
        Facture facture = new Facture("ma facture");

        try {
            facture.payer();

            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
        }
        catch(FactureException e)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Passed");
            m_passed++;
        }
    }
    
    private void TestFacture_ChangerEtat_Ouvert_Ferme_Payer()
    {
        Facture facture = new Facture("ma facture");

        try {
            facture.fermer();
            facture.payer();

            if(facture.getEtat() instanceof EtatPaye) {
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
        catch(FactureException e)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed with: " +
                    e.getMessage());
            m_failed++;
        }
    }

    private void TestFacture_ChangerEtat_Ouvert_Payer_Ouvert_DevraitThrow()
    {
        Facture facture = new Facture("ma facture");

        try {
            facture.fermer();
            facture.payer();
            facture.ouvrir();

            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
        }
        catch(FactureException e)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Passed");
            m_passed++;
        }
    }

    private void TestFacture_ChangerEtat_Ouvert_Payer_Fermer_DevraitThrow()
    {
        Facture facture = new Facture("ma facture");

        try {
            facture.fermer();
            facture.payer();
            facture.fermer();

            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Failed");
            m_failed++;
        }
        catch(FactureException e)
        {
            System.out.println(new Throwable()
                    .getStackTrace()[0]
                    .getMethodName() + ": Passed");
            m_passed++;
        }
    }
}
