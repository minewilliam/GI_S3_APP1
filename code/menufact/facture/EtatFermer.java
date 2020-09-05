package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class EtatFermer implements FactureEtat{
    private Facture facture;

    public void ouvrir() throws FactureException {
        facture.ChangerEtat(new EtatOuverte());
    }
    public void payer(){
        facture.ChangerEtat(new EtatPaye());
    }
    public void fermer() throws FactureException{
        facture.ChangerEtat(new EtatFermer());
    }
    public String toString(){
        return "Fermer";
    }
}
