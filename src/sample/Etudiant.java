package sample;

import javafx.collections.ObservableList;

public class Etudiant extends Personne {

    public int matricule;
    public static int matIncrement=0;

    Etudiant()
    {
        super();
        matIncrement++; //on incr�mente d'abord le matricule
        matricule=-1; //puis on l'enregistre
    }

    Etudiant(String n,String p,int j,int m, int a)
    {
        super(n,p,j,m,a);
        matIncrement++;
        matricule=matIncrement;
    }

    public int getMatricule()
    {
        return matricule;
    }

    public void setMatricule(int mat)
    {
        matricule = mat;
    }

    public String decrisEtudiant()
    {
        return (nom+" "+prenom+" ne le "+dateDeNaissance.toString()+" matricule: "+matricule+"\n");
    }






}
