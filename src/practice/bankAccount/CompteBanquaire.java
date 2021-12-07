package practice.bankAccount;

import static java.lang.Math.abs;
import static java.lang.Math.round;

public class CompteBanquaire {

    protected int code;
    protected float solde = 0.0f;

    CompteBanquaire(int code) {
        this.code = code;
    }

    CompteBanquaire(int code, float solde) {
        this.code = code;
        this.solde = solde;
    }

    public float getSolde() {
        return round(this.solde * 100) / 100.0f;
    }

    public void deposer(float montant) {
        this.solde += abs(montant);
        System.out.println("Dépôt de " + abs(montant) + " sur le compte n°" + this.code + " (nouveau solde : " + this.solde + ").");
    }

    public void retirer(float montant) {
        this.solde -= abs(montant);
        System.out.println("Retrait de " + abs(montant) + " sur le compte n°" + this.code + " (nouveau solde : " + this.solde + ").");
    }

    public boolean isDebiteur() {
        return this.solde < 0;
    }

    public boolean isCrediteur() {
        return this.solde >= 0;
    }

    public String toString() {
        return "Le solde est de " + round(this.solde * 100) / 100.0f;
    }
}
