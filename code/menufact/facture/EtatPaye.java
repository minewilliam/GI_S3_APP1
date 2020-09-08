package menufact.facture;

import menufact.facture.exceptions.FactureException;

public class EtatPaye implements IFactureEtat {
    private Facture facture;

    public EtatPaye(Facture facture){
        this.facture = facture;
    }
    /**
     *
     * @throws FactureException car l'etat est paye
     */
    public void ouvrir() throws FactureException {
        throw new FactureException("Une facture paye ne peut pas etre reouverte");
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
     * @throws FactureException car la facture est deja paye
     */
    public void fermer() throws FactureException{
        throw new FactureException("Une facture paye ne peut pas etre refermer");
    }
    /**
     *
     * @return l'etat en String
     */
    public String toString(){
        return "Payer";
    }
}
