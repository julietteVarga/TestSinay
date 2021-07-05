package fr.bo.exercice2;
public class Chercheur extends Enseignant {

    private static final int SALAIRE_BASE = 2000;
    private static final int HEURE_COMPLEMENTAIRE = 40;

    /**
     * Getter pour le salaire de base
     * @return int
     */
    public static int getSalaireBase() {
        return SALAIRE_BASE;
    }

    /**
     * Getter pour le taux de rémunération pour les heures complémentaires
     * @return int
     */
    public static int getHeureComplementaire() {
        return HEURE_COMPLEMENTAIRE;
    }

    /**
     * Constructeur par défaut
     */
    public Chercheur() {
    }

    /**
     * Constructeur avec tous les paramètres
     * @param nom
     * @param prenom
     * @param nombreHeuresCoursAnnee
     */
    public Chercheur(String nom, String prenom, int nombreHeuresCoursAnnee) {
        super(nom, prenom, nombreHeuresCoursAnnee);
    }


}
