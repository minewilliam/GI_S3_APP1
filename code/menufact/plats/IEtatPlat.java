package menufact.plats;

import menufact.plats.exceptions.PlatException;

public interface IEtatPlat {

    /**
     *
     * Permet de changer l'etat à EtatServi
     * @throws PlatException si le plat n'est pas terminer
     */
    public void Servir() throws PlatException;
    /**
     *
     * Permet de changer l'etat à EtatEnPreparation
     * @throws PlatException si le plat est deja servi
     */
    public void Preparer()throws PlatException;
    /**
     *
     * Permet de changer l'etat à EtatTermine
     * @throws PlatException si le plat est deja servi
     */
    public void EstPret()throws PlatException;

}
