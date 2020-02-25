package exercici_variables;

public class Fase4 {
	
	public static void main(String[] args) {
		
		// String vars
		String nom = "Carlos";
		String cognom1 = "Garcia";
		String cognom2 = "Romero";
		String leapBirth = "El meu any de neixement és de traspàs.";
		String notLeapBirth = "El meu any de neixement no és de traspàs.";
		
		// int vars
		int dia = 27;
		int mes = 12;
		int any = 1978;
		int base_year = 1948;

		// Fase 4
		String fullName = nom + " " + cognom1 + " " + cognom2;
		String birthDate = dia + "/" + mes + "/" + any;
	
		// Cada quan hi ha un any de traspàs
		int leap = 4;
		
		// Anys de traspàs entre 1948 i any de naixement
		int num_leap = (any - base_year) / leap;
		
		// Si volem incloure 1948, eliminar 'base_year+=4'
		for (base_year+=4; base_year<=any; base_year+=4) 
		{
			// System.out.println(base_year);						
		}
		
		// Si l'any de naixement és de traspàs base_year tindrà el valor del següent any de traspàs
		boolean traspas=(base_year-4 == any);
		
		// Fase 4
		System.out.println("El meu nom és " + fullName);
		System.out.println("Vaig nèixer el " + birthDate);
		
		if (traspas) {
			System.out.println(leapBirth);
		} else {
			System.out.println(notLeapBirth);
		}
	}
}
