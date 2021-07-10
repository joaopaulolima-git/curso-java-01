package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com uma Frase");
		String frase = sc.nextLine();
		
		System.out.println("Entre com a Letra escolhida");
		String letra = sc.nextLine();
		
		int cont = 0;
		for (int i=0; i<= frase.length()-1; i++) {
			if (frase.substring(i, i+1).equalsIgnoreCase(letra)) {
				cont++;
			}
			
		}
		System.out.println(cont);
		
		sc.close();

	}

}
