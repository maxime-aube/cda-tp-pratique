package practice.bankAccount;

public class CompteEpargne extends CompteBanquaire {

    private float tauxInteret = 6;

    CompteEpargne(int code) {
        super(code);
    }

    CompteEpargne(int code, float solde) {
        super(code, solde);
    }

    CompteEpargne(int code, float solde, float taux) {
        super(code, solde);
        this.tauxInteret = taux;
    }

    public float getTauxInteret() {
        return this.tauxInteret;
    }

    public void setTauxInteret(float tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public void calculInteret() {
        this.solde *= (this.tauxInteret / 100 + 1);
        System.out.println("Calcul des intérêts sur le compe n°" + this.code + "... " + this.toString());
    }

}
