package Metier;

public class creditMetier implements  ICreditMetier{

    @Override
    public double calulMensualiteCredit(double montant, double taux, int duree) {
        double t = taux/100;
        double t1 = (montant*t)/12;
        double t2 = 1-Math.pow(1+t/12,-duree);
        double mensualite = t1/t2;
        return mensualite;
    }
}
