package fr.bo.exercice2;

public class Vacataire extends Enseignant{

    private static final int HEURE_PAYEE = 40;

    /**
     * Getter pour le salaire pour une heure travaillée
     * @return int le salaire
     */
    public static int getHeurePayee() {
        return HEURE_PAYEE;
    }

    /**
     * Constructeur par défaut
     */
    public Vacataire() {
    }

    /**
     * Constructeur avec tous les paramètres
     * @param nom du vacataire
     * @param prenom du vacataire
     * @param nombreHeuresCoursAnnee nombre d'heures que le vacataire à assuré en une année
     */
    public Vacataire(String nom, String prenom, int nombreHeuresCoursAnnee) {
        super(nom, prenom, nombreHeuresCoursAnnee);
    }


}
