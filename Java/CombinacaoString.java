package DIO.Java;

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

            if (strgs[0].length() < strgs[1].length()){
                maiorStrg = strgs[1].length();
            }else {
                maiorStrg = strgs[0].length();
            }

			for (  int j=0; j < maiorStrg; j++) {
                if (strgs[0].length()-1 >= j){
                    resultado += strgs[0].charAt(j);
                }
                if (strgs[1].length()-1 >= j){
                    resultado += strgs[1].charAt(j);
                }
            }
			System.out.println(resultado);
        }
        scan.close();
	}
}