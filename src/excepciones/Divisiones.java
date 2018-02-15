package excepciones;


import java.util.Scanner;

public class Divisiones {

	private Integer dividendo = -1;
	private Integer divisor = -1;
	private float division = .0f;
	
	
	
	public void setDivisor(Integer _divisor) {
		this.divisor = _divisor;
	}

	public Integer getDivisor() {
		return this.divisor;
	}


	public void setDividendo(Integer _dividendo) {
		this.dividendo = _dividendo;
	}

	public Integer getDividendo() {
		return this.dividendo;
	}

  public void solicitaDatos() {
	  

		 String divisor_str = null;
		 String dividendo_str = null;
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("inserta numerador --> ");
		dividendo_str = scan.nextLine();
		
		System.out.println("inserta denominador --> ");
		divisor_str = scan.nextLine();
		
		
		int divndo = Integer.parseInt(dividendo_str);
		this.setDividendo(divndo);
		int divor = Integer.parseInt(divisor_str);
		this.setDivisor(divor);
		
	
  }
	public float dividir() {
		
			
			this.solicitaDatos();
			
			return division = (this.getDividendo() / this.getDividendo());
			
	
			/*		
			} catch (ArithmeticException e) {
				//Cuando hay divisor =  0
				System.err.println("ERROR --> No se puede dividir entre 0 estas loco? " );   
			} catch (NullPointerException ex){
				//Cuando hay un  un valor vacio
				System.err.println("ERROR --> No puedes dejar ningun campo vacio "); 
			} catch(NumberFormatException ex){
				// Si introduces una frase en la calculadora 
				System.err.println("ERROR --> Por favor introduce un numero, no lo escribas "); 		
			}finally{
				System.out.println("Resultado: " + division);
			}
			*/
	}

	public void visualizarDatos() {
		System.out.println("el resultado es " + division);
		
	}

	
}