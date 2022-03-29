package DIO.Java;

import java.io.IOException;
import java.util.Scanner;

public class AreaDireita {
	
    public static void main(String[] args) throws IOException {
      Scanner scan = new Scanner(System.in);
      double resultado = 0;
      char op = scan.next().toUpperCase().charAt(0);
      double[][] M = new double[12][12];

      for (int i=0;i<12;i++) {
        for (int j=0;j<12;j++) {
          M[i][j] = scan.nextDouble();
        }
      }

      for (int i=1;i<=10;i++) {
        for (int j=7;j<=11;j++) {
          if(i<7){
            if ((i+j) >= 12) resultado += M[i][j];
          }
          if(i>=7){
            if(j > i) resultado += M[i][j];
          }
        }
      }
      
      if (op == 'M') resultado /= 30;
      System.out.printf("%.1f\n", resultado);
      scan.close();
    }
}
