package menufact.facture.models;

public interface IFacturable {
    void setDescription(String description);
    String getDescription();
    void setCode(int code);
    int getCode();
    void setPrix(double prix);
    double getPrix();

    @Override
    String toString();
}