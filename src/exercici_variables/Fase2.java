package exercici_variables;

public class Fase2 {

	// Constant declaration
	static final int BASE_YEAR = 1948; 

	public static void main(String[] args) {

		// String vars
		String nom = "Carlos";
		String cognom1 = "Garcia";
		String cognom2 = "Romero";

		// int vars
		int dia = 27;
		int mes = 12;
		int any = 1978;

		// Cada quan hi ha un any de traspàs
		int leap = 4;

		// Anys de traspàs entre 1948 i any de naixement
		int num_leap = (any - BASE_YEAR) / leap;

		// Mostrar per pantalla
		// 1948 no incluido. Para incluirlo, ++num_leap en el println
		System.out.println(num_leap);		
	}
}
