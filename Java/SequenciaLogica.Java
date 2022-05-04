import java.io.IOException;
import java.util.Scanner;


public class Desafio {	
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println(i + " " + (i * i) + " " + (i * (i * i)));
			System.out.println(i + " " + (i * i+1) + " " + (i * (i * i)+1));
		}
    }
}