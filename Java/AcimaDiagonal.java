package DIO.Java;
import java.io.IOException;
import java.util.Scanner;

/**Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz M[12][12]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão acima da diagonal principal da matriz, conforme ilustrado abaixo (área verde).

 Entrada
A primeira linha de entrada contem um único caractere Maiúsculo O ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

Saída
Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal. */

public class AcimaDiagonal {
    public static void main(String[] args) throws IOException {
        try (Scanner leitor = new Scanner(System.in)) {
            float[][] matriz = new float[12][12];
              float resultado = 0.0f;
              String operacao = leitor.nextLine();
              int quantNum = 0;
              for(int x = 0; x < 12; x++){
                for(int y = 0; y <12; y++){
                  matriz[x][y] = leitor.nextFloat();
                }
              }
            for(int x = 0; x < 12; x++){
                for(int y = x+1; y <12; y++){
                    resultado += matriz[x][y];
                    quantNum++;
                }
            }
            switch (operacao){
            case "S":
                System.out.println(resultado);
                break;
            case "M":
                resultado /= quantNum;
                System.out.printf("%.1f",resultado);
                break;
            }
        }
    }
}
