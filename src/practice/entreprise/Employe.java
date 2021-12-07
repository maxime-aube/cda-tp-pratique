package practice.entreprise;

public class Employe {

    protected String nom;
    protected float tarifHoraire = 10;
    protected float volumeHoraire;
    protected float chargeHoraireDue = 40;
    protected float tauxSup = 30;

    // constructeur simple
    Employe(String nom) {
        this.nom = nom;
    }

    public String getName() {
        return this.nom;
    }

    // constructeur complet
    Employe(String nom, float tarifHoraire, float volumeHoraire) {
        this.nom = nom;
        this.tarifHoraire = tarifHoraire;
        this.volumeHoraire = volumeHoraire;
    }

    public void setInfosSalaire(float volumeHoraire, float chiffreAffaires) {
        this.volumeHoraire = volumeHoraire;
    }

    public float getSalaire() {
        float salaire = this.chargeHoraireDue * this.tarifHoraire;
        if (this.volumeHoraire > this.chargeHoraireDue) {
           salaire += (this.volumeHoraire - this.chargeHoraireDue) * (this.tarifHoraire * (this.tauxSup / 100 + 1));
        }
        return salaire;
    }
}
