package menufact.tests;

import menufact.Client;

public class TestClient {

    private static int clientId = 666;
    private static String nom = "Hubert";
    private static String numeroCarte = "2318952";
    private Client m_client = new Client(clientId, nom, numeroCarte);

    private int m_passed = 0;
    private int m_failed = 0;

    public TestClient()
    {
        System.out.println("Executing test suite: " + new Throwable().getStackTrace()[0]);

        try{
            TestClient_Constructor_HappyPath();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        TestClient_GetSetClientId();

        TestClient_GetSetNom();

        TestClient_GetSetNumeroCarteCredit();

        System.out.println("Test suite: " + new Throwable().getStackTrace()[0] + "Finished:");
        System.out.println("Passed: "+ m_passed + " Failed: " + m_failed);
    }

    private void TestClient_Constructor_HappyPath()
    {
        Client c = new Client(clientId, nom, numeroCarte);
        if(c.getIdClient() == clientId &&
        c.getNom() == nom &&
        c.getNumeroCarteCredit() == numeroCarte)
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

    private void TestClient_GetSetClientId()
    {
        Client c = new Client(clientId, nom, numeroCarte);
        c.setIdClient(555);

        if(c.getIdClient() == 555)
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

    private void TestClient_GetSetNom()
    {
        Client c = new Client(clientId, nom, numeroCarte);
        c.setNom("Peter");

        if(c.getNom() == "Peter")
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

    private void TestClient_GetSetNumeroCarteCredit()
    {
        Client c = new Client(clientId, nom, numeroCarte);
        c.setNumeroCarteCredit("23109856327");

        if(c.getNumeroCarteCredit() == "23109856327")
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
