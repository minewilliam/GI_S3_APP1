package menufact.plats;

import menufact.plats.exceptions.PlatException;

public interface EtatPlat {

    public void Servir() throws PlatException;
    public void Preparer()throws PlatException;
    public void EstPret()throws PlatException;

}
