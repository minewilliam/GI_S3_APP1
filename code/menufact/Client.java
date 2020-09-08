package menufact;

public class Client {
    private int idClient;
    private String nom;
    private String numeroCarteCredit;

    public Client(int idClient, String nom, String numeroCarteCredit) {
        this.idClient = idClient;
        this.nom = nom;
        this.numeroCarteCredit = numeroCarteCredit;
    }
    /**
     *
     * @return l'Id du client
     */
    public int getIdClient() {
        return idClient;
    }
    /**
     *
     * @param idClient l'Id du client
     */
    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
    /**
     *
     * @return le nom du Client
     */
    public String getNom() {
        return nom;
    }
    /**
     *
     * @param nom le nom du client
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     *
     * @return le Numero de Carte de Credit
     */
    public String getNumeroCarteCredit() {
        return numeroCarteCredit;
    }
    /**
     *
     * @param numeroCarteCredit le numero de Carte de Credit du client
     */
    public void setNumeroCarteCredit(String numeroCarteCredit) {
        this.numeroCarteCredit = numeroCarteCredit;
    }
    /**
     *
     * @return le client en chaine de Charactere
     */
    @Override
    public String toString() {
        return "menufact.Client{" +
                "idClient=" + idClient +
                ", nom='" + nom + '\'' +
                ", numeroCarteCredit='" + numeroCarteCredit + '\'' +
                '}';
    }
}
/*
@startuml
class menufact.Client{}
* */