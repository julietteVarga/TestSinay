package fr.service.exercice2;

import fr.bo.exercice2.Chercheur;
import fr.bo.exercice2.Enseignant;
/**
 * Classe utilisée pour contenir les fonctions importantes
 */
public class EnseignantService {


    /**
     * Fonction pour trouver le salaire dû à l'enseignant.
     * @return le salaire dû à l'enseignant.
     */
    public int calculSalaire(Enseignant enseignant){
        int salaire;
        if (enseignant instanceof Chercheur) {
            salaire = gestionSalaireChercheur((Chercheur) enseignant);
        }
        else {
            salaire = enseignant.getHeurePayee()*enseignant.getNombreHeuresCoursAnnee();
        }


        return salaire;
    }

    /**
     * Calcul de la paie spécifique aux Enseignants chercheurs
     * Si le chercheur effectue plus de 192 heures alors on ajoute 40 à chaque heure travaillée en plus.
     * @param chercheur l'enseignant chercheur
     * @return le salaire spécifique au chercheur.
     */
    private int gestionSalaireChercheur(Chercheur chercheur) {
        int salaire;
        if (chercheur.getNombreHeuresCoursAnnee() > 192) {
            int nombreHeuresComplementaires = chercheur.getNombreHeuresCoursAnnee() - 192;
            salaire = (chercheur.getSalaireBase()) + (nombreHeuresComplementaires * (chercheur.getHeureComplementaire()));
        } else {
            salaire = chercheur.getSalaireBase()*12;
        }
        return salaire;
    }

    /**
     * Fonction pour trouver le montant des charges payées par l'université.
     * @param enseignant l'enseignant
     * @return int le montant des charges
     */
    public int calculCharges(Enseignant enseignant){
        int salaire = calculSalaire(enseignant);
        return salaire/Enseignant.getPourcentageSalaire();
    }

    /**
     * Fonction pour retourner un récapitulatif de l'enseignant
     * @param enseignant l'enseignant
     * @return nom, prenom, nombre d'heures effectuées, le salaire et les charges payées par l'université
     */
    public String recapSalaire(Enseignant enseignant){
        return enseignant.toString()+ "\n"+ "Votre salaire : "
                +calculSalaire(enseignant)+ "\n"+ "Charges payées par l'université : "+calculCharges(enseignant) +"\n----";
    }


}
