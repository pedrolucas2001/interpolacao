package aulas;

import java.util.Locale;
import java.util.Scanner;

public class interpolacaoecondiconal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		int n1 = 0;
		int n2 = 0;
		
		System.out.println("Entre com o primeiro numero: ");
		n1 = leia.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		n2 = leia.nextInt();
		
		if (n1>n2) {
			System.out.printf("Numero %d é o maior", n1);
		}else { System.out.printf("Numero %d é o maior", n1);
		}
			
		leia.close();
		
		
		
		
	}
}
