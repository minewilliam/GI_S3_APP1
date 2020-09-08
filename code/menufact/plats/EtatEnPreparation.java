package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatEnPreparation implements EtatPlat {
    private PlatAuMenu plat;

    public EtatEnPreparation(PlatAuMenu plat){
        this.plat = plat;
    }
    public void Servir() throws PlatException {
        throw new PlatException("Le plat ne peut etre servi quand il est en preparation");
    }
    public void Preparer() throws PlatException{
        plat.ChangeState(new EtatEnPreparation(plat));
    }
    public void EstPret() throws PlatException{
        plat.ChangeState(new EtatTermine(plat));
    }
}
