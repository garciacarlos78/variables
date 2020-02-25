// Variables nom i cognoms
var myName="Carlos";
var cognom1="García";
var cognom2="Romero";

// Variables data naixement
var dia=27, mes=12, any=1978;

// Creació de constant
const BASE_YEAR=1948;

// Cada quant hi ha any de traspàs (4 anys)
var leap=4;

// Càlcul anys de traspàs entre 1948 (no inclós) i any de naixement
var num_leaps=Math.trunc((any-BASE_YEAR)/leap);

// Mostra dades per pantalla
document.write(num_leaps);
