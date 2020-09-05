package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class EtatPaye implements FactureEtat{
    private Facture facture;

    public void ouvrir() throws FactureException {
        throw new FactureException("Une facture paye ne peut pas etre reouverte");
    }
    public void payer(){
        facture.ChangerEtat(new EtatPaye());
    }
    public void fermer() throws FactureException{
        throw new FactureException("Une facture paye ne peut pas etre refermer");
    }
    public String toString(){
        return "Payer";
    }
}
