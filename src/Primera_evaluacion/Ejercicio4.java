package Primera_evaluacion;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("INTRODUCE PATRON: ");
		String consola = sc.nextLine();
		//String reNumero = consola.replaceAll("[0-9]", "");
		//String reletras = consola.replaceAll("[^0-9]", "");
		//int numero = Integer.parseInt(reNumero);
		//char letra = reletras.charAt(0);
		
		for(int i=0;i<consola.length();i++) {
			char letra = consola.charAt(i);
			int numero = Integer.parseInt("" +consola.charAt(++i));
		}
	
	}
	
}
