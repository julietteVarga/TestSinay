package fr.tp.bo;

public class Main {
    public static void main(String[] args) {
        //Avec le constructeur contenant tous les attributs
        Article article1 = new Article("ref","designation",30F, 3F);

        //Le recopieur
        Article article2 = new Article(article1);

        //Constructeur avec seulement la référence et la designation
        Article article3 = new Article("reference","designation");

        article3.setPrixHorsTaxes(120F);
        article3.setPrixTva(2F);

        //Avec contructeur par défaut
        Article article4 = new Article();

        article4.setReference("test");
        article4.setDesignation("testDesignation");
        article4.setPrixHorsTaxes(99F);
        article4.setPrixTva(6F);


        // Exercice 6
        ArticleTVA articleTva = new ArticleTVA("articleTVA","Designation",33F);


        //Afficher l'article 3
        System.out.println(article3.afficherArticle());
        //Afficher l'article TVA excercice 6
        System.out.println(articleTva.afficherArticle());
    }
}
