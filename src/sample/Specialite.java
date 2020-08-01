package sample;


import java.util.ArrayList;

public class Specialite {
    private String nom;
    private String filiere;
    private int anneeEtude;
    private ArrayList ensembleEtudiants;

    Specialite() {
        this.nom = "nom inconnue";
        this.filiere = "filiere inconnue";
        this.anneeEtude = 0;
        this.ensembleEtudiants = new ArrayList();
    }

    Specialite(String nom, String filiere, int aE) {
        this.nom = nom;
        this.filiere = filiere;
        this.anneeEtude = aE;
        this.ensembleEtudiants = new ArrayList();
    }

    public void ajouterEtudiant(Etudiant e) {
        this.ensembleEtudiants.add(e);
    }

    public Etudiant accederEtudiant(int i) {
        return (Etudiant)this.ensembleEtudiants.get(i);
    }

    public String getNomSpecialite() {
        return this.nom;
    }

    public String getFiliere() {
        return this.filiere;
    }

    public int getAnneEtude() {
        return this.anneeEtude;
    }

    public ArrayList getEnsembleEtudiants() {
        return this.ensembleEtudiants;
    }

    public void setNomSpecialite(String nom) {
        this.nom = nom;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public void setAnneEtude(int aE) {
        this.anneeEtude = aE;
    }

    public void setEnsembleEtudiants(ArrayList l) {
        this.ensembleEtudiants = l;
    }


}

