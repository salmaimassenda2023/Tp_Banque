package Metier;

public interface ICreditMetier {
    // duree est en mois
     double calulMensualiteCredit(double montant,double taux , int duree);
}
