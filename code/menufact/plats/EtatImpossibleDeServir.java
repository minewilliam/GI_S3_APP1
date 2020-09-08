package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatImpossibleDeServir implements IEtatPlat{
    private PlatAuMenu plat;

    public EtatImpossibleDeServir(PlatAuMenu plat){
        this.plat = plat;
    }
    /**
     *
     * Permet de changer l'etat à EtatServi
     * @throws PlatException si le plat n'est pas terminer
     */
    public void Servir() throws PlatException {
        throw new PlatException("Le plat ne peut pas etre Servi car il manque d'ingredient");
    }
    /**
     *
     * Permet de changer l'etat à EtatEnPreparation
     * @throws PlatException si le plat est deja servi
     */
    public void Preparer() throws PlatException{
        throw new PlatException("Le plat ne peut pas etre Preparer car il manque d'ingredient");
    }
    /**
     *
     * Permet de changer l'etat à EtatTermine
     * @throws PlatException si le plat est deja servi
     */
    public void EstPret() throws PlatException{
        throw new PlatException("Le plat ne peut pas etre Terminer car il manque d'ingredient");
    }
}
