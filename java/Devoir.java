import java.util.Date;

public class Devoir {

    private String nom;
    private String description;
    private Date deadline;
    private int nbPoint;

    public Devoir(String nom, String description, Date deadline, int nbPoint) {
        this.nom = nom;
        this.description = description;
        this.deadline = deadline;
        this.nbPoint = nbPoint;
    }

}
