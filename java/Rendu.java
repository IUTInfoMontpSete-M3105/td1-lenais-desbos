import java.util.Date;

public class Rendu {

    private String document;
    private Date date;
    private int note;

    public Rendu(String document, Date date) {
        this.document = document;
        this.date = date;
        this.note = 0;
    }

    public void setDocument(String doc){
        this.document = doc;
    }

    public void affecterEns(Enseignant ens){

    }

    public String getDoc(){
        return this.document;
    }

    public void setNote(int note){
        this.note = note;
    }

    @Override
    public String toString() {
        return "Rendu{" +
                "document='" + document + '\'' +
                ", date=" + date +
                ", note=" + note +
                '}';
    }

}
