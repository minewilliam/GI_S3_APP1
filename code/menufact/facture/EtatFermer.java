package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class EtatFermer implements IFactureEtat {
    private Facture facture;

    public EtatFermer(Facture facture){
        this.facture = facture;
    }

    /**
     *
     * Permet de changer l'etat à EtatOuverte
     */
    public void ouvrir() throws FactureException {
        facture.ChangerEtat(new EtatOuverte(facture));
    }
    /**
     *
     * Permet de changer l'etat à EtatPaye
     */
    public void payer(){
        facture.ChangerEtat(new EtatPaye(facture));
    }
    /**
     *
     * Permet de changer l'etat à EtatFermer
     */
    public void fermer() throws FactureException{
        facture.ChangerEtat(new EtatFermer(facture));
    }
    /**
     *
     * @return l'etat en String
     */
    public String toString(){
        return "Fermer";
    }
}
