<%-- 
    Document   : frmPrincipal
    Created on : 26/08/2016, 08:01:00 PM
    Author     : LABF30
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
        <!--<script type="text/javascript" src="js/ValidarCookies.js"></script>-->
        <script type="text/javascript" src="js/ValidaSession.js"></script>
        <script type="text/javascript" src="js/frmPrincipal.js"></script>
        
        <link type="text/css" rel="stylesheet" href="css/frmPrincipal.css">
        <title>JSP Page</title>
    </head>
    <%
        if ((String)session.getAttribute("usuario") == null) {
            response.sendRedirect("frmIngreso.jsp");
        } else {
            String per = (String)session.getAttribute("usuario");
            switch(per){
                case "Administrador":
                    break;
                case "Cajero":
                    break;
                case "Recepcionista":
                    break;
                default:
                    break;
            }
    %>
    <body>
        <nav>
            <h1>Clientes Registrados en la web</h1>
            <a href="#" id="frmRegistrarCliente.jsp" onclick="Solicitafrm(this)">Registrar Cliente </a><br>
            <a href="#" id="frmListaCliente.jsp" onclick="Solicitafrm(this);return false">Clientes Registrados (Web)</a><br>
            <a href="#" id="contrato" onclick="Solicitafrm(this);return false">Listar Cliente </a><br>
            <p>Bienvenido ${sessionScope.usuario}</p>
            <input type="button" id="cerrar" name="cerrar" value="Cerrar Sesion">
        </nav>
            <% String var= request.getParameter("perfil");%>
            ${sessionScope.perfil}
            <iframe id="contenido" name="contenido" src="" marginwidth="0" marginheight="0" style="position:absolute;border: none;" >
                
                
            </iframe>
    </body>
    <%
    }
    %>
</html>
