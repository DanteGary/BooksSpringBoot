$('#formulario').css('display','none');

var result = document.getElementById('nuevo');
var resultado = document.getElementById('cerrar');



$("#nuevo").click(function(){
    $('#formulario').show('slow');
});

$("#cerrar").click(function(){
    // document.getElementById("formulario").style.display = "none";
    $('#formulario').hide('slow');
    document.getElementById('formulario').reset();
});