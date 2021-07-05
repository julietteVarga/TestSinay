package fr.bo.exercice2;

public class Enseignant {
    private String nom;
    private String prenom;
    private int nombreHeuresCoursAnnee;
    private static final int POURCENTAGE_SALAIRE = 10;

    /**
     * Contructeur par défaut
     */
    public Enseignant() {
    }


    /**
     * Constructeur avec tous les attributs
     * @param  nom de l'enseignant
     * @param prenom de l'enseignant
     * @param nombreHeuresCoursAnnee le nombre d'heures de cours assurées par l'enseignant en une année
     */
    public Enseignant(String nom, String prenom, int nombreHeuresCoursAnnee) {
        this.nom = nom;
        this.prenom = prenom;
        this.nombreHeuresCoursAnnee = nombreHeuresCoursAnnee;
    }

    /**
     * Constructeur avec nom et prénom
     * @param nom de l'enseignant
     * @param prenom de l'enseignant
     */
    public Enseignant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Votre nom : " + nom + '\n' +
                "votre prenom : " + prenom + '\n' +
                "le nombre d'heure effectuées cette année : " + nombreHeuresCoursAnnee ;
    }

    /**
     * Getter du nom de l'enseignant
     * @return String : le nom de l'enseignant
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter du nom de l'enseignant
     * @param nom de l'enseignant
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter du prénom de l'enseignant
     * @return String : prénom de l'enseignant
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter du prénom de l'enseignant
     * @param prenom de l'enseignant
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * Getter du nombre d'heures de cours assurés dans l'année
     * @return int : le nombre d'heures de cours assurées par l'enseignant en une année
     */
    public int getNombreHeuresCoursAnnee() {
        return nombreHeuresCoursAnnee;
    }

    /**
     * Setter du nombre d'heures de cours assurés dans l'année
     * @param nombreHeuresCoursAnnee le nombre d'heures de cours assurées par l'enseignant en une année
     */
    public void setNombreHeuresCoursAnnee(int nombreHeuresCoursAnnee) {
        this.nombreHeuresCoursAnnee = nombreHeuresCoursAnnee;
    }

    /**
     * Getter du pourcentage du salaire.
     * @return int : le pourcentage du salaire
     */
    public static int getPourcentageSalaire() {
        return POURCENTAGE_SALAIRE;
    }
}
