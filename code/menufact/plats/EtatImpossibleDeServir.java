package menufact.plats;

import menufact.plats.exceptions.PlatException;

public class EtatImpossibleDeServir implements IEtatPlat{
    private PlatAuMenu plat;

    public EtatImpossibleDeServir(PlatAuMenu plat){
        this.plat = plat;
    }
    public void Servir() throws PlatException {
        throw new PlatException("Le plat ne peut pas etre Servi car il manque d'ingredient");
    }
    public void Preparer() throws PlatException{
        throw new PlatException("Le plat ne peut pas etre Preparer car il manque d'ingredient");
    }
    public void EstPret() throws PlatException{
        throw new PlatException("Le plat ne peut pas etre Terminer car il manque d'ingredient");
    }
}
