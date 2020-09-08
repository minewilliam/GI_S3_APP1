package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class EtatPaye implements IFactureEtat {
    private Facture facture;

    public EtatPaye(Facture facture){
        this.facture = facture;
    }

    public void ouvrir() throws FactureException {
        throw new FactureException("Une facture paye ne peut pas etre reouverte");
    }
    public void payer(){
        facture.ChangerEtat(new EtatPaye(facture));
    }
    public void fermer() throws FactureException{
        throw new FactureException("Une facture paye ne peut pas etre refermer");
    }
    public String toString(){
        return "Payer";
    }
}
