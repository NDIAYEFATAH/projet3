package entity;

public class Etudiant
{
    //Constantes
    public final int max_Notes = 10;
    //Attributs
    public static int nbEtudiant = 0;
    private String nom;
    public final int anneeActuel = 2023;
    private String prenom;
    private int anneeNais;
    private double[] tabNotes;
    private int nbNotes;
    //Constructeurs
    public Etudiant(String nom, String pren){
        this.nom=nom;
        prenom = pren;
        tabNotes = new double[max_Notes];
        nbEtudiant++;
        nbNotes = 0;
    }
    public Etudiant(String nom, String pren, int anneeNais){
        this.nom=nom;
        prenom = pren;
        this.anneeNais = anneeNais;
        nbEtudiant++;
        tabNotes = new double[10];
        nbNotes = 0;
    }
    //Accesseurs ou getters

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAnneeNais() {
        return anneeNais;
    }

    //Mutateurs ou Modificateurs ou setters

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAnneeNais(int anneeNais) {
        this.anneeNais = anneeNais;
    }

    //Methodes
    public double moyenne(){
        double somNote=0, moy;
        for (int i = 0; i < nbNotes; i++) {
            somNote += tabNotes[i];
        }
        moy =somNote/nbNotes;
        return moy;
    }
    public double max(){
        double maxNote = tabNotes[0];
        for (int i = 1; i < nbNotes; i++) {
            if (tabNotes[i] > maxNote){
                maxNote = tabNotes[i];
            }
        }
        return maxNote;
    }
    public double min(){
        double minNote = tabNotes[0];
        for (int i = 1; i < nbNotes; i++) {
            if (tabNotes[i] < minNote){
                minNote = tabNotes[i];
            }
        }
        return minNote;
    }
    public void ajouterNote(double note){
        if (nbNotes < max_Notes) {
            tabNotes[nbNotes] = note;
            nbNotes++;
        }else {
            System.out.println("Le tableau de note est plein");
        }
    }
    public int age(){
        return anneeActuel - anneeNais;
    }
    @Override
    public String toString(){
        return prenom + " " + nom + " " + age() + " ";
    }
    private String genereMAtricule(){
        String mat = "mat"+ nom.charAt(0)+ prenom.charAt(0) + nbEtudiant;
        return mat.toLowerCase();
    }

}
