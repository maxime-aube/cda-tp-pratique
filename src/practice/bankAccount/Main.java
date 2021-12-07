package practice.bankAccount;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {

        // déclaration des objets compte
        CompteBanquaire compteBanquaire = new CompteBanquaire(count.addAndGet(1), 100.0f);
        CompteEpargne compteEpargne = new CompteEpargne(count.addAndGet(1), 50.0f);
        ComptePayant comptePayant = new ComptePayant(count.addAndGet(1), 500.0f);

        // opérations de dépôt
        compteBanquaire.deposer(10);
        compteEpargne.deposer(20);
        comptePayant.deposer(30);

        //opérations de retrait
        compteBanquaire.retirer(30);
        compteEpargne.retirer(20);
        comptePayant.retirer(10);

        compteEpargne.calculInteret();

        System.out.println(compteBanquaire.toString());
        System.out.println(compteEpargne.toString());
        System.out.println(comptePayant.toString());
    }
}
