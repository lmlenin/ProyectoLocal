
function VerCita(e) {
    idcli = e.getAttribute("href");
    alert(idcli);
    var estx;//para mostrar el estado  sgte en la lista
    $.ajax({
        type: "POST",
        url: "Cita",
        data: {accionc: "BuscarCita", dnic: idcli}, // Adjuntar los campos del formulario enviado.
        async: true,
        cache: false,
        success: function (citas) {
            alert(citas + "datos");
            if (citas != "") {
                //$('#tablita').dataTable().fnClearTable().fnDraw();
                //$('#tablita').dataTable().fnAddData(citas);
                $('#tablita').dataTable().fnDestroy();//liberar totalmente para volver a iniciar
                $("#tablita tbody").empty();
                $.each(citas, function (ind, obj) {
                    switch (obj.estadoCit) {
                        case "Registrado":
                            estx = "Aprobado";
                            break;
                        case "Aprobado":
                            estx = "Atendido"
                            break;
                        case "Atendido":
                            estx = "Registrado";
                            break;
                        default :
                            alert("Estado Desconocido");
                            break;
                    }
                    //alert(ind+"indice");
                    $("#tablita").append($("<tr>").append("<td>" + obj.dni + "</td>"
                            + "<td>" + obj.fechaCita + "</td>"
                            + "<td>" + obj.detalle + "</td>"
                            + "<td>" + obj.estadoCit + "</td>"
                            + "<td><a href='" + obj.dni + "' onclick='CambiarEstado(this); return false' id='" + estx + "'>" + estx + "</a></td>"));
                });
            } else {
                alert("No se encontraron Citas");
            }
            //$('#tablita').dataTable();
            $('#tablita').dataTable({"bSort": false, "bPaginate": false,
                "bFilter": false,
                "bInfo": false});
        }
    });
    //alert("termine");
}



function CambiarEstado(e) {
    dniCli = e.getAttribute("href");
    estadoCita = e.getAttribute("id");
    alert(idcli + estadoCita);
    var estx;
    $.ajax({
        type: "POST",
        url: "Cita",
        data: {accionc: "CambiarEstado", dnic: dniCli, estadoc: estadoCita}, // Adjuntar los campos del formulario enviado.
        async: true,
        cache: false,
        success: function (citas) {
            $('#tablita').dataTable().fnDestroy();//liberar totalmente para volver a iniciar
            $("#tablita tbody").empty();
            alert(citas + "datos");
            $.each(citas, function (ind, obj) {
                //alert(ind+"indice");
                switch (obj.estadoCit) {
                    case "Registrado":
                        estx = "Aprobado";
                        break;
                    case "Aprobado":
                        estx = "Atendido"
                        break;
                    case "Atendido":
                        estx = "Registrado";
                        break;
                    default :
                        alert("Estado Desconocido");
                        break;
                }
                $("#tablita").append($("<tr>").append("<td>" + obj.dni + "</td>"
                        + "<td>" + obj.fechaCita + "</td>"
                        + "<td>" + obj.detalle + "</td>"
                        + "<td>" + obj.estadoCit + "</td>"
                        + "<td><a href='" + obj.dni + "' onclick='CambiarEstado(this); return false' id='" + obj.estadoCit + "'>" + estx + "</a></td>"));
            });
            //$('#tablita').dataTable();
            $('#tablita').dataTable({"bSort": false
                , ordering: false});
        }
    });


}

$(document).ready(function () {
    $("#loader").prop('id', 'loader2');
    /*Ventan Modal Control de Eventos*/
    $.ajax({
        type: "POST",
        url: "Cliente",
        data: {accion: "listar"}, // Adjuntar los campos del formulario enviado.
        async: true,
        cache: false,
        success: function (data) {
            $("#loader2").prop('id', 'loader');
            $.each(data, function (indice, objeto) {
                $("#tabla").append($("<tr>").append("<td>" + objeto.dni + "</td>"
                        + "<td>" + objeto.nombreCli + "</td>"
                        + "<td>" + objeto.apellidoCli + "</td>"
                        + "<td>" + objeto.domicilio + "</td>"
                        + "<td>" + objeto.estadoCli + "</td>"
                        + "<td><a href='" + objeto.dni + "' onclick='VerCita(this); return false' class='abrir'>Seleccionar</a></td>"
                        ));
            });
            $('#tabla').dataTable();
            /*Ventan Modal Control de Eventos*/
            $(".abrir").click(function (e) {
                $(".modal").fadeIn();
            });
            $(".cerrar").click(function () {
                $(".modal").fadeOut(300);
                //$('#tablita').dataTable().fnClearTable(); limpiar tabla con su misma funcion
                $('#tablita').dataTable().fnDestroy();//liberar totalmente para volver a iniciar
                $("#tablita tbody").empty();//limpiar datos de tbody
            });
            /*Ventan Modal Control de Eventos*/
        }
    });


});
