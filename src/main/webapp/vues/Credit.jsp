<%@ page import="Models.creditModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    creditModel model = (creditModel)request.getAttribute("creditModel");
%>
<html>
<head>
    <title>Title</title>
    <link  rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div>
        <form method="post" action="creditServlet">
            <table>
                <tr>
                    <td>Montant :</td>
                    <td> <input type="text" name="montant" value="<%= model.getMontant()%>"></td>
                    <td>DH</td>
                </tr>

                <tr>
                    <td>Duree :</td>
                    <td> <input type="text" name="duree" value="<%= model.getDuree()%>"></td>
                    <td>Mois</td>
                </tr>

                <tr>
                    <td>Taux :</td>
                    <td> <input type="text" name="taux" value="<%= model.getTaux()%>"></td>
                    <td>%</td>
                </tr>
            </table>
            <button type="submit">calculer</button>
        </form>
    </div>
     <div>
         Mensualite : <%= model.getMensualite()%>

     </div>
</body>
</html>
