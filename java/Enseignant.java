public class Enseignant extends Utilisateur{

    private String numen;
    private String harpege;
    private boolean isCDC;
    private String CDC;

    public Enseignant(String nom, String prenom, String adresse, String mail, String numen, String harpege) {
        super(nom, prenom, adresse, mail);
        this.numen=numen;
        this.harpege=harpege;
        this.isCDC=false;
        this.CDC=null;
    }

    public void creerDevoir(){

    }

    public void saisirNote(){

    }

    public boolean isCDC() {
        return isCDC;
    }

    public void setCDC(Enseignant ens, String cours){
        ens.isCDC=true;
        ens.CDC=cours;
    }

    public void removeCDC(Enseignant ens){
        ens.isCDC=false;
        ens.CDC=null;
    }

}
