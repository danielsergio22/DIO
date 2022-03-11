package DIO.Desafios;
import java.util.Scanner;

public class TempoDeJogo {
	public static void main(String[] args){         
    Scanner scan = new Scanner(System.in);
		int inicioH, fimH, inicioM, fimM, horas = 0 , minutos = 0;
		inicioH = scan.nextInt();
		inicioM = scan.nextInt();
		fimH = scan.nextInt();
		fimM = scan.nextInt();
		
		if(inicioH == fimH && inicioM == fimM){
			horas = 24;
		}
		while(inicioM != fimM){
		  minutos++;
		  inicioM++;
		  if(inicioM==60){
		    inicioM = 0;
		  }
		}
		while(inicioH != fimH){
		  horas++;
		  inicioH++;
		  if(inicioH==24){
		    inicioH = 0;
		  }
		}
		System.out.print("O JOGO DUROU " + horas + " HORA(S) E " + minutos + " MINUTO(S)\n");
		scan.close();
	}
}