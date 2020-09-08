package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatTermine implements IEtatPlat {
    private PlatAuMenu plat;

    public EtatTermine(PlatAuMenu plat){
        this.plat = plat;
    }
    public void Servir() throws PlatException {
        plat.ChangeState(new EtatServi(plat));
    }
    public void Preparer() throws PlatException{
        plat.ChangeState(new EtatEnPreparation(plat));
    }
    public void EstPret() throws PlatException{
        plat.ChangeState(new EtatTermine(plat));
    }
}
