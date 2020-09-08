package menufact;

import menufact.plats.PlatChoisi;

public class Chef implements ChefUpdate{
    private String nom;

    public Chef(String nom){
        this.nom = nom;
    }

    public void update(PlatChoisi p) {
        System.out.println("Chef " + nom + " a ete notifier que plat " + p.getCode() + " est commander");
    }
}
