package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class EtatFermer implements FactureEtat{
    private Facture facture;

    public EtatFermer(Facture facture){
        this.facture = facture;
    }

    public void ouvrir() throws FactureException {
        facture.ChangerEtat(new EtatOuverte(facture));
    }
    public void payer(){
        facture.ChangerEtat(new EtatPaye(facture));
    }
    public void fermer() throws FactureException{
        facture.ChangerEtat(new EtatFermer(facture));
    }
    public String toString(){
        return "Fermer";
    }
}
