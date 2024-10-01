/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase principal de la aplicación
 * @author rbr - 011024
 *
 */
public class Inicio {

	/**
	 * Método principal de la aplicación
	 * rbr - 011024
	 * @param args
	 */
	public static void main(String[] args) {


		//Variables
		int nota1 = 6, nota2 = 7;
		double media;
		
		//Calculo la media de las dos notas
		media = (nota1 + nota2) / 2;
		
		//Muestro la media por consola
		System.out.println("La media de las dos notas es: " + media);

	}

}
