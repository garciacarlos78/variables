package exercici_variables;

public class Fase3 {
	
	public static void main(String[] args) {
		
		// String vars
		String nom = "Carlos";
		String cognom1 = "Garcia";
		String cognom2 = "Romero";
		String leapBirth = "El teu any de neixement �s de trasp�s.";
		String notLeapBirth = "El teu any de neixement no �s de trasp�s.";

		// int vars
		int dia = 27;
		int mes = 12;
		int any = 1978;
		int base_year = 1948;
	
		// Cada quan hi ha un any de trasp�s
		int leap = 4;
		
		// Anys de trasp�s entre 1948 i any de naixement
		int num_leap = (any - base_year) / leap;
		
		// Si queremos incluir 1948, eliminar 'base_year+=4'
		for (base_year+=4; base_year<=any; base_year+=4) 
		{
			System.out.println(base_year);						
		}
		
		// Si l'any de naixement �s de trasp�s base_year tindr� el valor del seg�ent any de trasp�s
		boolean traspas=(base_year-4 == any);
		
		if (traspas) {
			System.out.println(leapBirth);
		} else {
			System.out.println(notLeapBirth);
		}
	}
}
