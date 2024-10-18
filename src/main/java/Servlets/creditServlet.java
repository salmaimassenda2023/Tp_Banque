package Servlets;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


import Metier.ICreditMetier;
import Metier.creditMetier;
import Models.creditModel;

@WebServlet(name = "creditServlet", value = "/creditServlet")
public class creditServlet extends HttpServlet {
    // Metier & Model
    private ICreditMetier metier ;
    private creditModel model;


    @Override
    public void init() {
        metier = new creditMetier();
        model = new creditModel();

    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("creditModel",model);
        request.getRequestDispatcher("/vues/Credit.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Recuper les donnees saisie par l utilisateur
        double montant = Double.parseDouble(request.getParameter("montant"));
        double taux = Double.parseDouble(request.getParameter("taux"));
        int duree =Integer.parseInt(request.getParameter("duree"));

        // Appeler Metier pour faire le traitement
        double mensualite =  metier.calulMensualiteCredit(montant,taux,duree);

        //stocker le resultat dNS LE Model
        model.setMontant(montant);
        model.setDuree(duree);
        model.setTaux(taux);
        model.setMensualite(mensualite);

        // stocker le model dans REQUEST
        request.setAttribute("creditModel",model);


        // faire un forward vers JSP
        request.getRequestDispatcher("/vues/Credit.jsp").forward(request,response);
    }


}
