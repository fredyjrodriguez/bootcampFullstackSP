package Challenge1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class String10characters {

	
	public static void main(String[] args) {
		// Prueba punto 2.a 
		
		System.out.println(getChain("tipo b"));
		
		// Prueba punto 2.b
		
		List<String> list = Arrays.asList("mango","banano","fresas","mora","pera");
		
		System.out.println("Escriba una fruta por favor");
		Scanner entrada1 = new Scanner(System.in);
			String z = entrada1.nextLine();

			System.out.println(validateIfItExits(z, list));		
		
	}	
		// Metodo punto 2.a
		public static String getChain(String chain){
			
			int number = (int)(Math.random()*100000000);
						
			String result= String.valueOf(number);
			if(chain.equalsIgnoreCase("tipo a")) {
				result = "54" + result;
				
			}else if (chain.equalsIgnoreCase("tipo b")) {
				result = "08" + result;
			}else {
				result = "opción incorrecta";
			}
			
			return result;
		}
		
	
		// Metodo punto 2.b
	public static boolean validateIfItExits (String z, List<String> list) {
	
	boolean result;
	if(list.contains(z)) {
		result = false;
	} else {
		result = true;
	}
	return (result);
	}	
		
}
