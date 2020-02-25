package exercici_variables;

public class Fase4 {
	
	public static void main(String[] args) {
		
		// String vars
		String nom = "Carlos";
		String cognom1 = "Garcia";
		String cognom2 = "Romero";
		String leapBirth = "El meu any de neixement �s de trasp�s.";
		String notLeapBirth = "El meu any de neixement no �s de trasp�s.";
		
		// int vars
		int dia = 27;
		int mes = 12;
		int any = 1978;
		int base_year = 1948;

		// Fase 4
		String fullName = nom + " " + cognom1 + " " + cognom2;
		String birthDate = dia + "/" + mes + "/" + any;
	
		// Cada quan hi ha un any de trasp�s
		int leap = 4;
		
		// Anys de trasp�s entre 1948 i any de naixement
		int num_leap = (any - base_year) / leap;
		
		// Si volem incloure 1948, eliminar 'base_year+=4'
		for (base_year+=4; base_year<=any; base_year+=4) 
		{
			// System.out.println(base_year);						
		}
		
		// Si l'any de naixement �s de trasp�s base_year tindr� el valor del seg�ent any de trasp�s
		boolean traspas=(base_year-4 == any);
		
		// Fase 4
		System.out.println("El meu nom �s " + fullName);
		System.out.println("Vaig n�ixer el " + birthDate);
		
		if (traspas) {
			System.out.println(leapBirth);
		} else {
			System.out.println(notLeapBirth);
		}
	}
}
