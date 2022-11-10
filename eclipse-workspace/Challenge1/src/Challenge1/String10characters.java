package Challenge1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class String10characters {

	private static final String A = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = (int)(Math.random()*100000000);
		String B = new String("Tipo B");
		String A = new String("Tipo A");
		
		
		System.out.println("Elija un tipo de entrada: \nTipo A \nTipo B");
		Scanner entrada = new Scanner(System.in);
			String y = entrada.nextLine(); 
			
			
			if (y.equalsIgnoreCase(A)) {
				System.out.println("54" + num);
			} else if(y.equalsIgnoreCase(B)) {
				System.out.println("08" + num);
			} else {
				System.out.println("Opcion incorrecta.");
			}
			
			
			
			List<String> list = Arrays.asList("mango","banano","fresas","mora","pera");
			
			System.out.println("Escriba una fruta por favor");
			Scanner entrada1 = new Scanner(System.in);
				String z = entrada.nextLine();

			
			boolean resultado;
			if(list.contains(z)) {
				resultado = false;
			} else {
				resultado = true;
			}
			System.out.println(resultado);
		
		}
		
		
	

}
