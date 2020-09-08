package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class EtatOuverte implements FactureEtat{
    private Facture facture;

    public EtatOuverte(Facture facture){
        this.facture = facture;
    }

    public void ouvrir() throws FactureException {
        facture.ChangerEtat(new EtatOuverte(facture));
    }
    public void payer() throws FactureException{
        throw new FactureException("Une facture doit etre fermer avant d etre payer");
    }
    public void fermer() throws FactureException{
        facture.ChangerEtat(new EtatFermer(facture));
    }
    public String toString(){
        return "Ouverte";
    }
}
