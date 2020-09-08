package menufact.facture;

import menufact.facture.exceptions.FactureException;

public interface IFactureEtat {

    /**
     *
     * Permet de changer l'etat à EtatOuverte
     * @throws FactureException si la Facture est deja paye
     */
    public void ouvrir() throws FactureException;
    /**
     *
     * Permet de changer l'etat à EtatPaye
     * @throws FactureException si la Facture est ouverte
     */
    public void payer() throws FactureException;
    /**
     *
     * Permet de changer l'etat à EtatFermer
     * @throws FactureException
     */
    public void fermer() throws FactureException;
    /**
     *
     * @return l'etat en String
     */
    public String toString();
}
