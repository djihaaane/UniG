package sample;


public abstract class Personne {
    protected String nom;
    protected String prenom;
    protected Ndate dateDeNaissance;

    Personne() {
        this.nom = "inconnue";
        this.prenom = "inconnue";
        this.dateDeNaissance = new Ndate();
    }

    Personne(String n, String p, int j, int m, int a) {
        this.nom = n;
        this.prenom = p;
        this.dateDeNaissance = new Ndate(j, m, a);
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String p) {
        this.prenom = p;
    }

    public Ndate getDateDeNaissance() {
        return this.dateDeNaissance;
    }

    public void setDateDeNaissance(Ndate d) {
        this.dateDeNaissance = d;
    }
}
