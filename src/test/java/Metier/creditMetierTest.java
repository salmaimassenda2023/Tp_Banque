package Metier;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class creditMetierTest {
    creditMetier credit = new creditMetier();

    @Test
    void calulMensualiteCredit() {
        double montant = 200000;
        int duree = 240 ;
        double taux = 4.5;
        double result_Attendu = 1265.2987;

        double result_calcule=credit.calulMensualiteCredit(montant,taux,duree);
        //comparer les resultats
        assertEquals(result_Attendu,result_calcule,0.0001);
    }

}