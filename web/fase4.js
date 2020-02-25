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

// Calculem si l'any de naixement és de traspàs
for (baseYear+=leap; baseYear<=any; baseYear+=leap){
	// document.write(baseYear + "<br>");
}

// Si l'any de naixement és de traspàs, quan acabi el bucle baseYear==any+4;
traspas = (baseYear-4 == any);

// Variables per les frases
var traspasSi="El meu any de naixement és de traspàs.";
var traspasNo="El meu any de naixement no és de traspàs.";

// Variables on juntem nom i cognmos i data de naixement
var fullName = cognom1 + " " + cognom2 + ", " + myName;
var fullDate = dia + "/" + mes + "/" + any;

// Missatges amb el nom i la data de naixement
document.write("El meu nom és " + fullName);
document.write("<br>Vaig nèixer el " + fullDate + "<br>");

// Missatge en funció de l'any de naixement de traspàs o no
if (traspas) {
	document.write(traspasSi);
} else {
	document.write(traspasNo);
}
