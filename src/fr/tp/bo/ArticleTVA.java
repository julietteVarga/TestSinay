package fr.tp.bo;

/**
 * Classe ArticleTVA pour répondre à la question 6
 */
public class ArticleTVA {
    private String reference;
    private String designation;
    private Float prixHorsTaxes;
    private static final Float PRIX_TVA = 20F;

    /**
     * Contructeur par défaut
     */
    public ArticleTVA() {
    }

    /**
     * Constructeur avec en paramètre la référence, la désignation et la prixHT
     * @param reference
     * @param designation
     * @param prixHorsTaxes
     */
    public ArticleTVA(String reference, String designation, Float prixHorsTaxes) {
        this.reference = reference;
        this.designation = designation;
        this.prixHorsTaxes = prixHorsTaxes;
    }

    /**
     * Constructeur avec en paramètre la référence et la désignation
     * @param reference
     * @param designation
     */
    public ArticleTVA(String reference, String designation) {
        this.reference = reference;
        this.designation = designation;
    }
    /**
     * Constructeur de copie d'articleTVA
     */
    public ArticleTVA(ArticleTVA articletva){
        reference = articletva.reference;
        designation = articletva.designation;
        prixHorsTaxes = articletva.prixHorsTaxes;
    }
    /**
     * La méthode pour afficher les informations d'un article
     * @return String : les informations de l'article.
     */
    public String afficherArticle() {
        return "La référence de l'article : " + reference +
                ", la designation de l'article : " + designation +
                ", le prix hors taxes de l'article : " + prixHorsTaxes +
                ", le prix TVA : " + PRIX_TVA +
                ", le prix TTC de l'article : " + calculerPrixTTC();
    }

    private Float calculerPrixTTC() {
        return this.prixHorsTaxes+(this.prixHorsTaxes*PRIX_TVA/100);
    }

    /**
     * Getter pour la référence de l'article
     * @return String : la référence
     */
    public String getReference() {
        return reference;
    }

    /**
     * Setter pour la référence de l'article
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Getter pour la désignation de l'article
     * @return String : la désignation
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Setter pour la désignation de l'article
     * @param designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * Getter pour le prix hors taxes de l'article
     * @return Float : le prix hors taxes
     */
    public Float getPrixHorsTaxes() {
        return prixHorsTaxes;
    }

    /**
     * Setter pour le prix hors taxes de l'article
     * @param prixHorsTaxes
     */
    public void setPrixHorsTaxes(Float prixHorsTaxes) {
        this.prixHorsTaxes = prixHorsTaxes;
    }

    /**
     * Getter du prix TVA
     * @return Float
     */
    public static Float getPrixTva() {
        return PRIX_TVA;
    }
}
