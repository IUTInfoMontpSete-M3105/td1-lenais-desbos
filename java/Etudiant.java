import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Etudiant extends Utilisateur{

    private String numEtudiant;
    private ArrayList<Cours> mesCours;

    public Etudiant(String nom, String prenom, String adresse, String mail, String numEtudiant) {
        super(nom, prenom, adresse, mail);
        this.numEtudiant=numEtudiant;
        this.mesCours= new ArrayList<>();
    }

    public void suivreCours(Cours cours){
        mesCours.add(cours);
    }

    public void telechargerDevoir(){

    }

    public Rendu rendreDevoir(String document, Date date){
        return new Rendu(document,date);
    }

    @Override
    public String toString() {
        return "L'étudiant numéro " + numEtudiant +
                " suis les cours de : " + mesCours +
                '.';
    }
}
