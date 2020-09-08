package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatServi implements IEtatPlat {
    private PlatAuMenu plat;

    public EtatServi(PlatAuMenu plat){
        this.plat = plat;
    }
    public void Servir() throws PlatException {
        throw new PlatException("Le plat ne peut pas etre reservie");
    }
    public void Preparer() throws PlatException{
        throw new PlatException("Le plat a deja ete servi, il ne peut pas etre preparer");
    }
    public void EstPret() throws PlatException{
        throw new PlatException("Le plat a deja ete servi, il ne peut pas etre Terminer");
    }
}
