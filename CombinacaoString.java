package DIO;

import java.util.Scanner;

public class CombinacaoString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
        scan.nextLine();
        
		for (int i = 0; i < N; i++) {
            int maiorStrg;
            String resultado = "" ;

			String[] strgs = scan.nextLine().split(" ");
            char[] chars1 = strgs[0].toCharArray();
            char[] chars2 = strgs[1].toCharArray();

            if (chars1.length < chars2.length){
                maiorStrg = chars2.length;
            }else {
                maiorStrg = chars1.length;
            }

			for (  int j=0; j < maiorStrg; j++) {
                if (chars1.length-1 >= j){
                    resultado += chars1[j];
                }
                if (chars2.length-1 >= j){
                    resultado += chars2[j];
                }
            }
			System.out.println(resultado);
		}
        scan.close();
	}
}