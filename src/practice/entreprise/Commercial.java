package practice.entreprise;

public class Commercial extends Employe {

    protected float base = 1000;
    protected float chiffreAffaires = 0;

    Commercial(String nom) {
        super(nom);
    }

    Commercial(String nom, float chiffreAffaires) {
        super(nom);
        this.chiffreAffaires = chiffreAffaires;
    }

    Commercial(String nom, float chiffreAffaires, float base) {
        super(nom);
        this.chiffreAffaires = chiffreAffaires;
        this.base = base;
    }

    public float getSalaire() {
        return this.base + (this.chiffreAffaires / 100);
    }
}
