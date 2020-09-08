package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatCommande implements IEtatPlat {
    private PlatAuMenu plat;

    public EtatCommande(PlatAuMenu plat){
        this.plat = plat;
    }
    /**
     *
     * @throws
     */
    public void Servir() throws PlatException {
        throw new PlatException("Le plat ne peut etre servi quand il est seulement commande");
    }
    public void Preparer() throws PlatException{
        plat.ChangeState(new EtatEnPreparation(plat));
    }
    public void EstPret() throws PlatException{
        plat.ChangeState(new EtatTermine(plat));
    }
}
