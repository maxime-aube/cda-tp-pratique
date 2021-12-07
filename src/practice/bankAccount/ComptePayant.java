package practice.bankAccount;

import static java.lang.Math.abs;

public class ComptePayant extends CompteBanquaire {

    private float fee = 5.0f;

    ComptePayant(int code) {
        super(code);
    }

    ComptePayant(int code, float solde) {
        super(code, solde);
    }

    ComptePayant(int code, float solde, float fee) {
        super(code, solde);
        this.fee = fee;
    }

    public void deposer(float montant) {
        this.solde += abs(montant);
        applyFees();
        System.out.println("Dépôt de " + abs(montant) + " sur le compte n°" + this.code + " (nouveau solde : " + this.solde + ").");
    }

    public void retirer(float montant) {
        this.solde -= abs(montant);
        applyFees();
        System.out.println("Retrait de " + abs(montant) + " sur le compte n°" + this.code + " (nouveau solde : " + this.solde + ").");
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }

    private void applyFees() {
        this.solde -= this.fee;
    }
}
