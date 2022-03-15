package DIO;

import java.util.Scanner;

public class KageBushinNoJutsu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0, vezes = 0;
		n = sc.nextInt();
		jutsu(n,vezes);
		
		sc.close();
	}
	public static void jutsu(int n, int vezes){
	  if(n>1){
	    jutsu(n/2, vezes+1);
	  }else {
        System.out.println(vezes);
      }
	}
}