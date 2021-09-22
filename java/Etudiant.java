public class Etudiant extends Utilisateur{

    private String numEtudiant;

    public Etudiant(String nom, String prenom, String adresse, String mail, String numEtudiant) {
        super(nom, prenom, adresse, mail);
        this.numEtudiant=numEtudiant;
    }

    public void suivreCours(){

    }

    public void telechargerDevoir(){

    }

    public void rendreDevoir(){

    }

}
