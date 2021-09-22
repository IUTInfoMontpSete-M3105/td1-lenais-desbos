public class Cours {

    private String nom;
    private int semestre;

    public Cours(String nom, int semestre) {
        this.nom = nom;
        this.semestre = semestre;
    }

    public void uploadDoc(){

    }

    public void informerEns(Enseignant ens){

    }

    public void informerEtud(Etudiant etud){

    }

    public void delivrerCert(){

    }

    @Override
    public String toString() {
        return "Cours de " + nom +
                " du semestre " + semestre +
                '.';
    }
}
