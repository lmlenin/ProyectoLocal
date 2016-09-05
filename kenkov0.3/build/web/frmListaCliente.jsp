<%-- 
    Document   : frmListaCliente
    Created on : 03/09/2016, 07:36:17 PM
    Author     : LENIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/jquery-2.1.1.min.js"></script>
        <script type="text/javascript" src="js/frmListarCliente.js"></script>
        <link type="text/css" rel="stylesheet" href="css/jquery.dataTables.css">
        <script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="js/table.js"></script>

        

        <title>.:SYGESCO:.Lista CLiente</title>
    </head>
    <body>
        <table id="tabla" class="display" cellspacing="0" width="100%">
            <thead>
                <tr>
                    <th>DNI</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Domicilio</th>
                    <th>Estado</th>
                    <th>Ver Cita</th>
                </tr>
            </thead>
            <tbody>

            </tbody>
            <tfoot>
                 <tr>
                    <th>DNI</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Domicilio</th>
                    <th>Estado</th>
                    <th>Ver Cita</th>
                </tr>
            </tfoot>
        </table>
        <div id="loader" class="imgloader"><img src="img/loader.gif" width="100" height="100"></div>
        <!-- Modal-->
        <div class="modal">
            <div class="ventana">
                <table id="tablita" class="display" cellspacing="0" width="95%">
                    <thead>
                        <tr>
                            <td>Codigo Cliente</td>
                            <td>Fecha Cita</td>
                            <td>Detalle</td>
                            <td>Estado Cita</td>
                            <td>Cambiar Estado</td>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                    <tfoot>
                        <tr>
                            <td>Codigo Cliente</td>
                            <td>Fecha Cita</td>
                            <td>Detalle</td>
                            <td>Estado Cita</td>
                            <td>Cambiar Estado</td>
                        </tr>
                    </tfoot>
                </table>
                <span class="cerrar">x</span>
            </div>
        </div>
        <!-- Modal-->
    </body>
    <link type="text/css" rel="stylesheet" href="css/frmListaCliente.css">
</html>
