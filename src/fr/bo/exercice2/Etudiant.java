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
     * @param nom
     * @param prenom
     * @param nombreHeuresCoursAnnee
     */
    public Etudiant(String nom, String prenom, int nombreHeuresCoursAnnee) {
        super(nom, prenom,nombreHeuresCoursAnnee);
        if(nombreHeuresCoursAnnee>HEURE_PAS_DEPASSER){
            System.err.println("un étudiant ne peut pas dépasser les "+HEURE_PAS_DEPASSER+" heures de travail par an!");
        }
    }

    /**
     * Constructeur avec nom et prénom
     * @param nom
     * @param prenom
     */
    public Etudiant(String nom, String prenom) {
        super(nom, prenom);
    }

    /**
     * Getter pour le nombre d'heure à ne pas dépasser pour un étudiant
     * @return int
     */
    public static int getHeurePasDepasser() {
        return HEURE_PAS_DEPASSER;
    }

    /**
     * Salaire pour une heure travaillée
     * @return int
     */
    public static int getHeurePayee() {
        return HEURE_PAYEE;
    }

    @Override
    public void setNombreHeuresCoursAnnee(int nombreHeuresCoursAnnee) {
        super.setNombreHeuresCoursAnnee(nombreHeuresCoursAnnee);
        if(nombreHeuresCoursAnnee>HEURE_PAS_DEPASSER){
            System.err.println("un étudiant ne peut pas dépasser les "+HEURE_PAS_DEPASSER+" heures de travail par an!");
        }
    }
}
