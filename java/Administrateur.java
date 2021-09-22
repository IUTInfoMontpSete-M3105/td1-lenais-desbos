public class Administrateur extends Utilisateur{

    public Administrateur(String nom, String prenom, String adresse, String mail) {
        super(nom, prenom, adresse, mail);
    }

    public void creerCours(Enseignant cdc, String matiere, int semestre){
        Cours cours = new Cours(matiere,semestre);
        cdc.setCDC(cdc,matiere);
    }

    public void supprimerCours(Cours cours){

    }

    public void supprimerAffectation(){

    }

}
