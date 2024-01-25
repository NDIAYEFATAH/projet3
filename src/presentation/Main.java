package presentation;

import entity.Etudiant;

public class Main {
    public static void main(String[] args) {
        //Instanciation des Objets
        Etudiant e1 = new Etudiant("Ndiaye","Fallou");
        Etudiant e2 = new Etudiant("Dieye","Sokhna",2002);

        System.out.println("Infos Etudiant 1");
        System.out.println("Nom : "+ e1.getNom());
        System.out.println("Prenom : " + e1.getPrenom());
        System.out.println("Infos etudiant 2");
        System.out.println("Nom : "+ e2.getNom());
        System.out.println("Prenom : "+ e2.getPrenom());
        System.out.println("Annee Naissance : "+ e2.getAnneeNais());

        if (e1.age() > e2.age()){
            System.out.println(e1.getPrenom()+ " " + e1.getNom()+
                    "("+e1.age()+" ans) est plus agee que " +
                    e2.getPrenom()+ " " + e2.getNom()+
                    "("+e2.age()+" ans)");
        } else if (e2.age() > e1.age()) {
            System.out.println(e2.getPrenom()+ " " + e2.getNom()+
                    "("+e2.age()+" ans) est plus agee que " +
                    e1.getPrenom()+ " " + e1.getNom()+
                    "("+e1.age()+" ans)");
        }
    }

}