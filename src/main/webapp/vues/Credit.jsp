<%@ page import="Models.creditModel" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    creditModel model = (creditModel)request.getAttribute("creditModel");
%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css">

</head>
<body>
  <div  class="container">
      <div class="card border-primary">
           <div class="card-header bg-primary text-white text-center">Semulation du credit </div>
          <div class="card-body">
              <form method="post" action="creditServlet">

                  <div class="form-group">
                      <label class="form-label">Montant</label>
                      <input class="form-control" type="text" name="montant" value="<%= model.getMontant()%>">
                  </div>
                  <div class="form-group">

                      <label class="form-label">Duree</label>
                      <input class="form-control" type="text" name="duree" value="<%= model.getDuree()%>"%>
                  </div>

                  <div class="form-group">
                      <label class="form-label">Taux</label>
                      <input class="form-control" type="text" name="taux" value="<%= model.getTaux()%>" %>
                  </div>

                  <div  class="form-group mt-3">
                      <BUTTON type="submit" class="btn btn-danger">Calculer</BUTTON>
                  </div>

              </form>

              <div>
                  <label>Mensualite </label>
                  <label><%=model.getMensualite()%></label>
              </div>
          </div>


      </div>
  </div>

</body>
</html>
