package sample;

public class Enseignant extends Personne{

    private String module;
    private String grade;
    private Specialite specialite;

    //constructeurs
    Enseignant()
    {
        super();
        module = "module inconnue";
        grade = "grade inconnue";
        specialite = new Specialite();
    }

    Enseignant(String n,String p,int j,int m, int a,String module, String grade,Specialite spec)
    {
        super(n,p,j,m,a);
        specialite = spec;
    }

    Enseignant(String n,String p,int j,int m, int a,String module, String grade,String nomSpecialite, String filiere, int anneeE)
    {
        super(n,p,j,m,a);
        this.module = module;
        this.grade = grade;
        specialite = new Specialite(nomSpecialite,filiere,anneeE);
    }

    public void ajouterEtudiantEnseignant(Etudiant e)
    {
        specialite.ajouterEtudiant(e);
    }

    public Etudiant accederEtudiantEnseignant(int i)
    {
        return specialite.accederEtudiant(i);
    }

    public String getModule()
    {
        return module;
    }

    public String getGrade()
    {
        return grade;
    }

    public Specialite getSpecialite()
    {
        return specialite;
    }

    public void setModule(String module)
    {
        this.module = module;
    }

    public void setGrade(String grade)
    {
        this.grade = grade;
    }

    public void setSpecialte(Specialite s)
    {
        this.specialite = s;
    }


}
