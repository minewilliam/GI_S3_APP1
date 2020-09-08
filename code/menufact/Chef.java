package menufact;

import menufact.plats.PlatChoisi;
import menufact.plats.exceptions.PlatException;

public class Chef implements IChefUpdate {
    private String nom;

    public Chef(String nom){
        this.nom = nom;
    }
    /**
     *
     *
     * @param p Notify le chef que ce plat est ajouter a la facture
     */
    public void update(PlatChoisi p) {
        System.out.println("Chef " + nom + " a ete notifier que plat " + p.getCode() + " est commander");
    }
}
