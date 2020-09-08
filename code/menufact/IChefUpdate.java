package menufact;

import menufact.plats.PlatChoisi;

public interface IChefUpdate {
    /**
     *
     *  @param p Notify le chef que ce plat est ajouter a la facture
     */
    public void update(PlatChoisi plat);
}
