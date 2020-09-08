package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatServi implements IEtatPlat {
    private PlatAuMenu plat;

    public EtatServi(PlatAuMenu plat){
        this.plat = plat;
    }
    /**
     *
     * Permet de changer l'etat à EtatServi
     * @throws PlatException si le plat n'est pas terminer
     */
    public void Servir() throws PlatException {
        throw new PlatException("Le plat ne peut pas etre reservie");
    }
    /**
     *
     * Permet de changer l'etat à EtatEnPreparation
     * @throws PlatException si le plat est deja servi
     */
    public void Preparer() throws PlatException{
        throw new PlatException("Le plat a deja ete servi, il ne peut pas etre preparer");
    }
    /**
     *
     * Permet de changer l'etat à EtatTermine
     * @throws PlatException si le plat est deja servi
     */
    public void EstPret() throws PlatException{
        throw new PlatException("Le plat a deja ete servi, il ne peut pas etre Terminer");
    }
}
