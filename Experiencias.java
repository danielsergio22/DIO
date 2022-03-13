package DIO;
import java.util.Scanner;

public class Experiencias {

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    int n = 0, qtde = 0, coelho = 0, rato = 0, sapo = 0, total = 0; 
		char tipo = '\u0000'; 
		double perc_coelho = 0, perc_rato = 0, perc_sapo = 0; 
		
		n = sc.nextInt(); 

		for(int i = 1; i <= n; i++) {
			qtde = sc.nextInt();
			tipo = sc.next().charAt(0);
			tipo = Character.toUpperCase(tipo); 
			switch(tipo) {
				case 'C': 
					coelho += qtde;
					break;
				case 'R': 
					rato += qtde;
					break; 
				case 'S': 
					sapo += qtde; 
					break;
				}
			}
			total = coelho + sapo + rato;
			perc_coelho = (double) coelho / total * 100; 
			perc_rato = (double) rato / total * 100;  
			perc_sapo = (double) sapo / total * 100;
			System.out.println("Total: " + total + " cobaias"); 
			System.out.println("Total de coelhos: " + coelho);
			System.out.println("Total de ratos: " + rato);
			System.out.println("Total de sapos: " + sapo);
			System.out.printf("Percentual de coelhos: %.2f %%\n", perc_coelho);
			System.out.printf("Percentual de ratos: %.2f %%\n", perc_rato);
			System.out.printf("Percentual de sapos: %.2f %%\n", perc_sapo);
			sc.close();
	}
}
