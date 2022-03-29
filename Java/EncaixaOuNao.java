package DIO.Java;

import java.util.Scanner;

public class EncaixaOuNao {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		
		for (int i = 0; i < count; i++) {
			String A = scan.next();
			String B = scan.next();
            
			if (A.endsWith(B)) System.out.println("encaixa");
			else System.out.println("nao encaixa");
		}
        scan.close();
	}
}