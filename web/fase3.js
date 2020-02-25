// Variables nom i cognoms
var myName="Carlos";
var cognom1="García";
var cognom2="Romero";

// Variables data naixement
var dia=27, mes=12, any=1978;

// Any de traspàs base, ara variable
var baseYear=1948;

// Cada quant hi ha any de traspàs (4 anys)
var leap=4;

// Bool indicant si l'any de naixement és de traspàs
var traspas;

// Mostra anys de traspàs entre 1948 (no inclós) i any de naixement (inclòs)
for (baseYear+=leap; baseYear<=any; baseYear+=leap){
	document.write(baseYear + "<br>");
}

// Si l'any de naixement és de traspàs, quan acabi el bucle baseYear==any+4;
traspas = (baseYear-4 == any);

// Variables per les frases
var traspasSi="<br>El meu any de naixement és de traspàs.";
var traspasNo="<br>El meu any de naixement no és de traspàs.";

// Missatge en funció de l'any de naixement de traspàs o no
if (traspas) {
	document.write(traspasSi);
} else {
	document.write(traspasNo);
}
