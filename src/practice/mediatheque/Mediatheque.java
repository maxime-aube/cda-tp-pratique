package practice.mediatheque;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Mediatheque {

    protected List<Media> collection = new ArrayList<Media>();

    public void add(Media m) {
        this.collection.add(m);
    }

    public ArrayList<Media> filter(String critere, String valeur) {

        ArrayList<Media> matchList = new ArrayList<Media>();

        switch (critere) {
            case "author":
                for (Media m : this.collection) {
                    if (m.author.toLowerCase().contains(valeur.toLowerCase())) {
                        matchList.add(m);
                    }
                }
                break;
            case "title":
                for (Media m : this.collection) {
                    if (m.title.toLowerCase().contains(valeur.toLowerCase())) {
                        matchList.add(m);
                    }
                }
                break;
            default:

                /**
                 * — sur le type de m ́edia (on pourra utiliser l’instruction nomObjet instanceof
                 * nomClasse qui retourne true si l’objet nomObjet est une instance de la classe
                 * nomClasse ou de l’une de ses classes filles)
                 * Toutes les comparaisons ne tiendront pas compte de la casse. Par exemple : m.filtre("titre",
                 * "ToTo") renverra l’ensemble des m ́edia dont le titre en minuscule est toto et
                 * m.filtre("media", "CD") renverra l’ensemble des CD de la collection.
                 */

                break;
        }

        return matchList;
    }
}
