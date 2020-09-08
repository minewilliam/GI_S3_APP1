package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatCommande implements IEtatPlat {
    private PlatAuMenu plat;

    public EtatCommande(PlatAuMenu plat){
        this.plat = plat;
    }
    /**
     *
     * Permet de changer l'etat à EtatServi
     * @throws PlatException si le plat n'est pas terminer
     */
    public void Servir() throws PlatException {
        throw new PlatException("Le plat ne peut etre servi quand il est seulement commande");
    }
    /**
     *
     * Permet de changer l'etat à EtatEnPreparation
     * @throws PlatException si le plat est deja servi
     */
    public void Preparer() throws PlatException{
        plat.ChangeState(new EtatEnPreparation(plat));
    }
    /**
     *
     * Permet de changer l'etat à EtatTermine
     * @throws PlatException si le plat est deja servi
     */
    public void EstPret() throws PlatException{
        plat.ChangeState(new EtatTermine(plat));
    }
}
