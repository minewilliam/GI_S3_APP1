package menufact;

import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;

import java.util.ArrayList;

public class Menu {
    private String description;
    private int courant;
    private ArrayList<PlatAuMenu> plat = new ArrayList<>();

    public Menu(String description) {
        this.description = description;
    }
    /**
     *
     * @param p le plat a ajouter au menu
     */
    public void ajoute (PlatAuMenu p)
    {
        plat.add(p);
    }
    /**
     *
     * @param i la position du plat dans la liste
     */
    public void position(int i)
    {
        courant = i;
    }
    /**
     *
     * @return le plat Courant
     */
    public PlatAuMenu platCourant()
    {
        return plat.get(courant);
    }
    /**
     *
     * Permet de passer au prochain plat dans la liste
     * @throws MenuException si il n'y a pas de prochain plat
     */
    public void positionSuivante() throws MenuException
    {
        if (courant+1 >= plat.size())
            throw new MenuException("On depasse le nombre maximale de plats.");
        else
            courant++;
    }

    /**
     *
     * Permet de passer au plat precedent dans la liste
     * @throws MenuException si il n'y a pas de plat precedent
     */
    public void positionPrecedente() throws MenuException
    {
        if (courant-1 < 0)
            throw new MenuException("On depasse le nombre minimale de plats");
        else
            courant--;
    }

    /**
     *
     * @return le menu en chaine de Charactere
     */
    @Override
    public String toString() {
        return "menufact.Menu{" +
                "description='" + description + '\'' +
                ", courant=" + courant +
                ", plat=" + "\n" + plat +
                '}';
    }
}
