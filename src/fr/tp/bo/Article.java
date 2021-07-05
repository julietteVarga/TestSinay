package fr.tp.bo;

/**
 * Classe Article pour répondre aux questions de 1 à 5
 */
public class Article {
    private String reference;
    private String designation;
    private Float prixHorsTaxes;
    private Float prixTva;

    /**
     * Constructeur par défaut
     */
    public Article() {
    }

    /**
     * Constructeur pour tous les attributs
     * @param reference
     * @param designation
     * @param prixHorsTaxes
     * @param prixTva
     */
    public Article(String reference, String designation, Float prixHorsTaxes, Float prixTva) {
        this.reference = reference;
        this.designation = designation;
        this.prixHorsTaxes = prixHorsTaxes;
        this.prixTva = prixTva;
    }

    /**
     * Constructeur pour renseigner la référence et la désignation
     * @param reference
     * @param designation
     */
    public Article(String reference, String designation) {
        this.reference = reference;
        this.designation = designation;
    }

    /**
     * Constructeur de copie d'article
     */
    public Article(Article article){
        reference = article.reference;
        designation = article.designation;
        prixHorsTaxes = article.prixHorsTaxes;
        prixTva = article.prixTva;
    }



    /**
     * Méthode qui retourne le prix ttc de l'article donné en paramètre
     * @return Float : le prix TTC de l'article
     */
    public Float calculerPrixTTC(){
        return this.prixHorsTaxes+(this.prixHorsTaxes*this.prixTva/100);
    }

    /**
     * La méthode pour afficher les informations d'un article
     * @return String : les informations de l'article.
     */
    public String afficherArticle() {
        return "La référence de l'article : " + reference +
                ", la designation de l'article : " + designation +
                ", le prix hors taxes de l'article : " + prixHorsTaxes +
                ", le prix TVA : " + prixTva +
                ", le prix TTC de l'article : " + calculerPrixTTC();
    }


    /**
     * Getter de Reference
     * @return un string : la réference de l'article
     */
    public String getReference() {
        return reference;
    }

    /**
     * Setter de Reference
     * @param reference
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * Getter de Designation
     * @return un string : la désignation de l'article
     */
    public String getDesignation() {
        return designation;
    }

    /**
     * Setter de Désignation
     * @param designation
     */
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    /**
     * Getter du prix hors taxes
     * @return Float : le prix hors taxes de l'article
     */
    public Float getPrixHorsTaxes() {
        return prixHorsTaxes;
    }

    /**
     * Setter du prix hors taxes
     * @param prixHorsTaxes
     */
    public void setPrixHorsTaxes(Float prixHorsTaxes) {
        this.prixHorsTaxes = prixHorsTaxes;
    }

    /**
     * Getter du prix TVA
     * @return Float : le prix TVA de l'article
     */
    public Float getPrixTva() {
        return prixTva;
    }

    /**
     * Setter du prix TVA
     * @param prixTva
     */
    public void setPrixTva(Float prixTva) {
        this.prixTva = prixTva;
    }
}
