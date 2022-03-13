package DIO;
import java.util.Scanner;

public class NumeroCientifico {
    public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double X = scan.nextDouble();
		
		if(X > 0){ // aqui é o que separa numero positivo do negativo e imprime
		System.out.printf("+%.4E", X );
		} else {
		System.out.printf("%.4E", X );

        scan.close();
	}
}
}
