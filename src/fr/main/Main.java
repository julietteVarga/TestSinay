package fr.main;

import fr.bo.exercice2.Chercheur;
import fr.bo.exercice2.Etudiant;
import fr.bo.exercice1.Article;
import fr.bo.exercice1.ArticleTVA;
import fr.bo.exercice2.Vacataire;
import fr.service.exercice2.EnseignantService;

public class Main {
    public static void main(String[] args) {

        //Pour l'exercice 1
        System.out.println("-----------------------------exercice 1 -------------------------------");

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
        System.out.println("-----------------------------fin de l'exercice 1 -------------------------------\n");


    //-------------------------------------------------------------------------------------------------------------------------------------------

        // Exercice 2
        System.out.println("-----------------------------exercice 2 -------------------------------\n");

        Chercheur chercheur = new Chercheur("Chercheur","Juliette",300);
        Etudiant etudiant = new Etudiant("Varga","Juliette",60);
        Etudiant etudiantHorsLaLoi = new Etudiant("Etudiant","Juliette");
        Etudiant etudiantHorsLaLoi2 = new Etudiant("Test","Test",130);
        Vacataire vacataire = new Vacataire("Vacataire","Juliette",196);


        etudiantHorsLaLoi.setNombreHeuresCoursAnnee(300);

        EnseignantService ficheSalaire = new EnseignantService();

        System.out.println("------------------------Chercheur-------------------------------------");
        System.out.println(ficheSalaire.recapSalaire(chercheur));
        System.out.println("------------------------Etudiant-------------------------------------");
        System.out.println(ficheSalaire.recapSalaire(etudiant));
        System.out.println(ficheSalaire.recapSalaire(etudiantHorsLaLoi));
        System.out.println(ficheSalaire.recapSalaire(etudiantHorsLaLoi2));
        System.out.println("------------------------Vacataire-------------------------------------");
        System.out.println(ficheSalaire.recapSalaire(vacataire));
    }
}
