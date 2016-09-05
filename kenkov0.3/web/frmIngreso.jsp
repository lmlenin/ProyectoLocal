<%-- 
    Document   : frmIngreso
    Created on : 26/08/2016, 06:55:21 PM
    Author     : LABF30
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
        <!-- <script type="text/javascript" src="js/ValidarCookies.js"></script> -->
        <script type="text/javascript" src="js/ValidarUsuario.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <form name="form1" id="form1">
            USUARIO: <input type="text"  name="txtUsu" id="txtUsu" required=""><br>
            CLAVE : <input type="password" name="txtCla" id="txtCla" required="">
            <br>
            <input type="submit" id="btnEnviar">
            <input type="reset" name="btnReset">
        </form>
        <div id="respuesta" style="background-color: tomato;width: 250px;height: 100px;color: black;">

        </div>
    </body>
</html>
