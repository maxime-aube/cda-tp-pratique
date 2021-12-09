package exceptions;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Country> countries = new ArrayList<Country>();

//        countries.add(new Country("France"));
//        countries.add(new Country("Allemagne"));
//        countries.add(new Country("Royaume-Uni"));
//        countries.add(new Country("Espagne"));
//        countries.add(new Country("Italie"));
//        countries.add(new Country("Grèce"));
//        countries.add(new Country("USA"));
//        countries.add(new Country("Chine"));
//        countries.add(new Country("Japon"));

        try {
            afficherListe(countries);
        } catch (ListEmptyException e) {
            System.out.println(e);
        }


        countries.sort(Comparator.comparing(Country::getName)); // sort alphabetically

        try {
            afficherListe(countries);
        } catch (ListEmptyException e) {
            System.out.println(e);
        }

        countries.sort(Comparator.comparing(Country::getNameLength)); // sort by name length

        try {
            afficherListe(countries);
        } catch (ListEmptyException e) {
            System.out.println(e);
        }

        // gestion d'erreur sur division par zéro
        int num = 10;
        int divider = 0;
        try {
            if (divider == 0 ) {
                throw new DivisionByZeroException();
            } else {
                System.out.println(num/divider);
            }
        } catch (DivisionByZeroException e) {
            System.out.println(e.toString());
            System.out.println(num/1);
        } finally {
            System.out.println("Enfin fini...");
        }
    }

    public static void afficherListe(ArrayList<Country> countries) throws ListEmptyException {

        if (countries.size() > 0) {
            System.out.println("La collection contient " + countries.size() + " pays.");
            for (Country c : countries) {
                System.out.println(c.getName());
            }
        } else {
            throw new ListEmptyException();
        }
    }
}
