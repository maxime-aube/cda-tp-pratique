package practice.entreprise;

public class EmployeSup extends Employe {

    EmployeSup(String nom) {
        super(nom);
        this.tauxSup = 50;
    }

    EmployeSup(String nom, float tarifHoraire, float volumeHoraire) {
        super(nom);
        this.tauxSup = 50;
        this.tarifHoraire = tarifHoraire;
        this.volumeHoraire = volumeHoraire;
    }

}
