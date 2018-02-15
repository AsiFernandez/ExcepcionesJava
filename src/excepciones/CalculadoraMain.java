package excepciones;





import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CalculadoraMain extends Divisiones {

	
	
	public static void main(String[] args) throws Exception {
		float resultado = -1;
		
		Scanner scan = new Scanner (System.in);
		Divisiones division1 = new Divisiones();
		
		
		//division1.solicitaDatos();
		division1.setDividendo(30);
		division1.setDivisor(10);
		
		try {
			resultado = division1.dividir();
		} catch (ArithmeticException e) {
			//Cuando hay divisor =  0
			System.err.println("ERROR --> No se puede dividir entre 0 estas loco? " );   
		} catch (NullPointerException ex){
			//Cuando hay un  un valor vacio
			System.err.println("ERROR --> No puedes dejar ningun campo vacio "); 
		} catch(NumberFormatException ex){
			// Si introduces una frase en la calculadora 
			System.err.println("ERROR --> Por favor introduce un numero, no lo escribas "); 		
	
		
		division1.visualizarDatos(); //System.out.println("el resultado es " + resultado);
	}
		}
}
	
		
		