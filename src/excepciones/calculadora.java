package excepciones;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class calculadora extends Divisiones {

	
	
	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner (System.in);
		Divisiones division1 = new Divisiones();
		
		division1.dividir();
		
		
//		String dividendo_str;
//		String divisor_str;
//		Integer dividendo;
//		Integer divisor;
//		float division = .0f;
//		try{
//			
//			System.out.println("inserta numerador --> ");
//			dividendo_str = scan.nextLine();
//			
//			System.out.println("inserta denominador --> ");
//			divisor_str = scan.nextLine();
//			
//			
//			dividendo = Integer.parseInt(dividendo_str);
//			divisor = Integer.parseInt(divisor_str);
//			
//			division = (dividendo / divisor);
//			
//		} catch (ArithmeticException e) {
//			//Cuando hay divisor =  0
//			System.err.println("ERROR --> No se puede dividir entre 0 estas loco? " );   
//		} catch (NullPointerException ex){
//			//Cuando hay un  un valor vacio
//			System.err.println("ERROR --> No puedes dejar ningun campo vacio "); 
//		} catch(NumberFormatException ex){
//			// Si introduces una frase en la calculadora 
//			System.err.println("ERROR --> Por favor introduce un numero, no lo escribas "); 		
//		}finally{
//			System.out.println("Resultado: " + division);
//		}
		
		
	}

}