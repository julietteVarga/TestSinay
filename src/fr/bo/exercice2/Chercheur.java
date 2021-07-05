package fr.bo.exercice2;
public class Chercheur extends Enseignant {

    private static final int SALAIRE_BASE = 2000;
    private static final int HEURE_COMPLEMENTAIRE = 40;

    /**
     * Getter pour le salaire de base
     * @return int le salaire de base
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
     * @param nom du chercheur
     * @param prenom du chercheur
     * @param nombreHeuresCoursAnnee nombre d'heures que le chercheur à assuré en une année
     */
    public Chercheur(String nom, String prenom, int nombreHeuresCoursAnnee) {
        super(nom, prenom, nombreHeuresCoursAnnee);
    }


}
