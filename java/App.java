import java.util.Date;

public class App {

    public static void main(String[] args) {

        Cours cours = new Cours("Math",1);
        System.out.println(cours);

        Devoir devoir1 = new Devoir("Controle1","premier control", new Date(), 20);
        Devoir devoir2 = new Devoir("DM","devior maison en java",new Date(),40);

        System.out.println(devoir1);
        System.out.println(devoir2);

        Administrateur admin = new Administrateur("Durant","François","Maison","travail@boulo.com");

        System.out.println(admin);

        Enseignant ens1 = new Enseignant("Deveau", "Marise", "Maison2", "sommeil@dodo.fr", "NUMEN1", "Harpege1");
        Enseignant ens2 = new Enseignant("Poulou", "Paul", "Maison3", "soleil@lune.fr", "NUMEN2", "Harpege2");

        System.out.println(ens1);
        System.out.println(ens2);

        Etudiant etu1 = new Etudiant("Desbos", "Emilie", "Maison4", "j-en@ai.com","123E");
        Etudiant etu2 = new Etudiant("Desbos", "Laura", "Maison4", "pas@fatigue.com","E456");

        System.out.println(etu1);
        System.out.println(etu2);

        Cours c1 = admin.creerCours(ens1,"info",2);
        Cours c2 = admin.creerCours(ens2,"anglais",1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(ens1);
        System.out.println(ens2);
        admin.supprimerAffectation(ens2);
        System.out.println(ens1);
        System.out.println(ens2);

        etu1.suivreCours(c1);
        etu1.suivreCours(c2);
        etu2.suivreCours(c2);
        System.out.println(etu1);
        System.out.println(etu2);
        Rendu rendu1 = etu1.rendreDevoir("Math",new Date());
        Rendu rendu2 = etu2.rendreDevoir("anglais",new Date());
        System.out.println(rendu1);
        System.out.println(rendu2);




    }

}
