
$(document).ready(function () {
    //ValidarSesion();

    $("#cerrar").click(function () {
        $.ajax({
            type: "POST",
            url: "Seguridad",
            data: {cerrar: "cerrar"}, // Adjuntar los campos del formulario enviado.
            async: true,
            cache: false,
            success: function (data)
            {
                switch (data){
                    case "0":
                        alert("No se cerro la sesion");
                        break;
                    case "1":
                        alert("Se cerro la sesion");
                        location.href = "frmIngreso.jsp";
                        break;
                    default :
                    break;
                            
                        
                }
            }
        });
    });
});

//function ValidarSesion() {
//    usu = getCookie("usuario");
//    alert(usu + "cookiw valudasesion");
//    if (usu == "" || usu == null) {
//        alert("registrate");
//        location.href = 'frmIngreso.jsp';
//        setCookie("registro", "Registrece para poder Ingresar");
//    } else {
//        alert('bienvenido');
//    }
//}