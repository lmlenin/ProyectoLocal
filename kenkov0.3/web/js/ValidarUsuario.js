
$(document).ready(function () {
    alert('cargo');
    $("#respuesta").hide();
    $("#respuesta").click(function () {
        $("#respuesta").fadeOut();
    });

    $("#form1").submit(function () {
        $.ajax({
            type: "POST",
            url: "Usuario",
            data: {usuario: $("#txtUsu").val(), clave: document.getElementById("txtCla").value}, // Adjuntar los campos del formulario enviado.
            async: true,
            cache: false,
            success: function (data)
            {
                switch (data) {
                    case "1":
                        $("#respuesta").empty();
                        $("#respuesta").fadeOut();
                        $("#respuesta").append("Usuario o Contraseña Incorrecta");
                        $("#respuesta").fadeIn();
                        break;
                    case "2":
                        $("#respuesta").empty();
                        $("#respuesta").fadeOut();
                        $("#respuesta").append("Llene todos los campos para continuar");
                        $("#respuesta").fadeIn();
                        break;
                    case "3":
                        location.href = "frmPrincipal.jsp";
                        alert(data+"dara");
                        break;
                    default :
                        alert("se ha cerrado la sesion anterioir "+data);
                        //setCookie("", "");
                }
            }
        });
        return false;
    });
});
//            function Valida() {
//                //var url = "Usuario"; // El script a dónde se realizará la petición.
//                $.ajax({
//                    type: "POST",
//                    url: "Usuario",
//                    data: {usuario: $("#txtUsu").val(), clave: document.getElementById("txtCla").value}, // Adjuntar los campos del formulario enviado.
//                    async: true,
//                    cache: false,
//                    success: function (data)
//                    {
//                        switch (data) {
//                            case "1":
//                                $("#respuesta").empty();
//                                $("#respuesta").append("Usuario o Contraseña Incorrecta");
//                                $("#respuesta").fadeIn();
//                                break;
//                            case "2":
//                                $("#respuesta").empty();
//                                $("#respuesta").append("Llene todos los campos para continuar");
//                                $("#respuesta").fadeIn();
//                                break;
//                            default :
//                                location.href = 'frmPrincipal.jsp';
//                                setCookie("usuario",data,1);
//                                alert(getCookie("usuario"));
//                        }
//                    }
//                });
//
//            };