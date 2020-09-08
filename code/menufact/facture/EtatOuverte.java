package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class EtatOuverte implements IFactureEtat {
    private Facture facture;

    public EtatOuverte(Facture facture){
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
     * @throws FactureException car l'etat est Ouverte
     */
    public void payer() throws FactureException{
        throw new FactureException("Une facture doit etre fermer avant d etre payer");
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
        return "Ouverte";
    }
}
