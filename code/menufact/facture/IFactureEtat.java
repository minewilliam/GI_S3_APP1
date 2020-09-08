package menufact.facture;

import menufact.facture.exceptions.FactureException;

public interface IFactureEtat {

    public void ouvrir() throws FactureException;
    public void payer() throws FactureException;
    public void fermer() throws FactureException;
    public String toString();
}
