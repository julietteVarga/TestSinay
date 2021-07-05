package fr.service.exercice2;

import fr.bo.exercice2.Chercheur;
import fr.bo.exercice2.Enseignant;
import fr.bo.exercice2.Etudiant;
import fr.bo.exercice2.Vacataire;

/**
 * Classe utilisée pour contenir les fonctions importantes
 */
public class EnseignantService {


    /**
     * Fonction pour trouver le salaire dû à l'enseignant.
     * @return le salaire dû à l'enseignant.
     */
    public int calculSalaire(Enseignant enseignant){
        int salaire = 0;
        if (enseignant instanceof Chercheur) {
            if (enseignant.getNombreHeuresCoursAnnee() > 192) {
                int nombreHeuresComplementaires = enseignant.getNombreHeuresCoursAnnee() - 192;
                salaire = (Chercheur.getSalaireBase()*12) + (nombreHeuresComplementaires * Chercheur.getHeureComplementaire());
            } else {
                salaire = Chercheur.getSalaireBase()*12;
            }
        }
        else if (enseignant instanceof Vacataire){
            salaire = Vacataire.getHeurePayee()*enseignant.getNombreHeuresCoursAnnee();
        }
        else{
            if(enseignant.getNombreHeuresCoursAnnee()> Etudiant.getHeurePasDepasser()){
                salaire = Etudiant.getHeurePayee()*enseignant.getNombreHeuresCoursAnnee();
            }
            else{
                salaire = Etudiant.getHeurePayee()*enseignant.getNombreHeuresCoursAnnee();
            }
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
