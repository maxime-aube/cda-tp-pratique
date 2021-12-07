package practice.entreprise;

import java.util.ArrayList;
import java.util.List;

public class Paie {

    public static void main(String[] args) {

        List<Employe> employeList = new ArrayList<Employe>();
        employeList.add(new Employe("A"));
        employeList.add(new EmployeSup("B", 15, 45));
        employeList.add(new Commercial("C", 830, 1200));

//        Employe employe = new Employe("A");
//        EmployeSup employeSup = new EmployeSup("B", 15, 45);
//        Commercial commercial = new Commercial("C", 830, 1200);

        employeList.get(0).setInfosSalaire(42, 0);

        for (Employe employe : employeList) {
            System.out.println(employe.getName() + " gagne " + employe.getSalaire());
        }
    }
}
