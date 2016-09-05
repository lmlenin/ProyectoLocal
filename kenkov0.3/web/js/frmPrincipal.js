
//document.getElementById("link").getAttribute("href");
//$("#RegistrarCliente").click(function () {
//    $.ajax({
//        type: "POST",
//        url: "Cliente",
//        data: {accion: "sregistraCliente"}, // Adjuntar los campos del formulario enviado.
//        async: true,
//        cache: false,
//        success: function (data) {
//            $("#contenido").append(data);
//        }
//    });
//    return false;
//});

$(document).ready(function () {
    
});

function Solicitafrm(e){
    var r = e.getAttribute("id");
//    alert("diste click");
//    $.ajax({
//        type: "POST",
//        url: "Cliente",
//        data: {accion: r}, // Adjuntar los campos del formulario enviado.
//        async: true,
//        cache: false,
//        success: function (data) {
            //$("#contenido").add(data);
            //window.frames['contenido'].location = a;
            $('#contenido').attr("src", r)
            alert(r);
//        }
//    });
    return false;
}
