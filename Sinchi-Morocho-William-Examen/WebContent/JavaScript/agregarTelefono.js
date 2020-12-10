/**
 * 
 */


var cantidadtelefonos;

window.onload = function () {/*hace que se cargue la función lo que predetermina que div estará oculto hasta llamar a la función nuevamente*/
   
    cantidadtelefonos = 0;
    document.getElementById("cantidadFactura").value = 0;
}

var telefonos = [];
function agregarFila(){
	
	var bandera = false;
	var table = document.getElementById("totalTelefonos");
    var e = document.getElementById("tipos");
	var e1 = document.getElementById("operadoras");
    var tipo = e.options[e.selectedIndex].text;
    var idTipo = e.options[e.selectedIndex].value;
	var operadora = e1.options[e1.selectedIndex].text;
	var idOperadora = e1.options[e1.selectedIndex].value;
    var numero = document.getElementById("numero").value;



	if (numero != "" ){
		cantidadtelefonos = document.getElementById("cantidadTelefonos").value;
		cantidadtelefonos++;
		document.getElementById("cantidadTelefonos").value =cantidadtelefonos; 
		var rowCount = table.rows.length;
		table.insertRow(-1).innerHTML = '<td><input type="text" name="num'+cantidadtelefonos+'" value="'+numero+'" readonly></td><td><input type="text" name="tiptlf' + cantidadtelefonos + '" value="' + tipo + '" readonly ></td><td><input type="text" name="opetlf' + cantidadtelefonos + '" value="' + operadora + '"   readonly> </td>';
		
	}else{
		alert("Ingrese el numero");
	}
	
	
}
function eliminarFila() {
    var table = document.getElementById("totalTelefonos");
    var rowCount = table.rows.length;

    if (rowCount <= 1)
        alert('No se puede eliminar el encabezado');
    else
        table.deleteRow(rowCount - 1);
    cantidadtelefonos = document.getElementById("cantidadTelefonos").value;
    cantidadtelefonos--;
    document.getElementById("cantidadTelefonos").value = cantidadtelefonos;
    //telefonos.pop();
}