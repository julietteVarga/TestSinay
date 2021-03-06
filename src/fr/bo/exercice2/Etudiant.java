package fr.bo.exercice2;

public class Etudiant extends Enseignant {
    private static final int HEURE_PAS_DEPASSER = 96;
    private static final int HEURE_PAYEE = 30;


    /**
     * Constructeur par défaut
     */
    public Etudiant() {
    }

    /**
     * Contructeur avec tous les paramètres
     * @param nom de l'étudiant
     * @param prenom de l'étudiant
     * @param nombreHeuresCoursAnnee nombre d'heures que l'étudiant à assuré en une année
     */
    public Etudiant(String nom, String prenom, int nombreHeuresCoursAnnee) {
        super(nom, prenom,nombreHeuresCoursAnnee);
        if(nombreHeuresCoursAnnee>HEURE_PAS_DEPASSER){
            System.err.println(erreurEtudiant());
        }
    }

    /**
     * Constructeur avec nom et prénom
     * @param nom de l'étudiant
     * @param prenom de l'étudiant
     */
    public Etudiant(String nom, String prenom) {
        super(nom, prenom);
    }

    /**
     * Fonction pour retourner un message d'erreur si jamais l'étudiant travaille plus de temps qu'il ne doit.
     * @return String
     */
    private String erreurEtudiant(){
        return "un étudiant ne peut pas dépasser les "+this.getHeurePasDepasser()+" heures de travail par an! "
                +"Veuillez contacter l'étudiant "+ this.getNom() + " " + this.getPrenom()+ " afin de voir en détail avec" +
                " lui";
    }

    /**
     * Getter pour le nombre d'heure à ne pas dépasser pour un étudiant
     * @return int
     */
    public int getHeurePasDepasser() {
        return HEURE_PAS_DEPASSER;
    }

    @Override
    public int getHeurePayee() {
        return HEURE_PAYEE;
    }

    /**
     * Override la méthode pour avoir un message d'erreur lorsqu'un étudiant dépasse le nombre d'heures de travail maximum
     * @param nombreHeuresCoursAnnee .
     */
    @Override
    public void setNombreHeuresCoursAnnee(int nombreHeuresCoursAnnee) {
        super.setNombreHeuresCoursAnnee(nombreHeuresCoursAnnee);
        if(nombreHeuresCoursAnnee>HEURE_PAS_DEPASSER){
            System.err.println(erreurEtudiant());
        }
    }
}
