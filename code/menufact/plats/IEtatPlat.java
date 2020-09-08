package menufact.plats;

import menufact.plats.exceptions.PlatException;

public interface IEtatPlat {

    public void Servir() throws PlatException;
    public void Preparer()throws PlatException;
    public void EstPret()throws PlatException;

}
