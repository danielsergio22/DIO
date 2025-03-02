package DIO.Java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
 
public class TabuleiroSecreto {
    public static void main(String[] args) throws IOException {
        List<Integer> arrayOrdenado = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n, q, op, x, r,maiorNumRep =0 ,valorRepetido = 0;
        
        n = scan.nextInt();
        q = scan.nextInt();

        int[][] tab = new int[n][n];
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                tab[i][j] = 0;
            }
        }
     
        for(int i=0; i<q; i++){
            op = scan.nextInt();
            switch(op){
                
                case 1:
                    x = scan.nextInt();
                    r = scan.nextInt();
                    for(int a=0;a<n;a++){
                        tab[x-1][a] = r;
                    }
                break;
                case 2:
                    x = scan.nextInt();
                    r = scan.nextInt();
                    for(int a=0;a<n;a++){
                        tab[a][x-1] = r;
                    }
                break;
                case 3:
                    maiorNumRep = 0;
                    valorRepetido = 0;
                    x = scan.nextInt();
                    for(int a=0;a<n;a++){
                        arrayOrdenado.add(tab[x-1][a]);
                    }
                    for(int b=0;b<n;b++){
                        int numRep = Collections.frequency(arrayOrdenado,tab[x-1][b]);
                        if(numRep >= maiorNumRep) {
                            maiorNumRep = numRep;
                            if(valorRepetido <= tab[x-1][b]){
                              valorRepetido = tab[x-1][b];  
                            }
                        }                        
                    }
                    arrayOrdenado.clear();
                    System.out.println(valorRepetido);
                break;
                case 4:
                    maiorNumRep = 0;
                    valorRepetido = 0;
                    x = scan.nextInt();
                    for(int a=0;a<n;a++){
                        arrayOrdenado.add(tab[a][x-1]);
                    }
                    for(int b=0;b<n;b++){
                        int numRep = Collections.frequency(arrayOrdenado,tab[b][x-1]);
                        if(numRep >= maiorNumRep) {
                            maiorNumRep = numRep;
                            if(valorRepetido <= tab[b][x-1]){
                              valorRepetido = tab[b][x-1];  
                            }
                        }                        
                    }
                    arrayOrdenado.clear();
                    System.out.println(valorRepetido);
                break;
            }
        }
        scan.close();
    }
}

// O tabuleiro secreto

/* O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior
fábrica de jogos de tabuleiros do mundo. 
Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro,
que ele apelidou de Tabuleiro da Frequência.
O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões
N × N é dado contendo apenas 0’s. Depois disso, Q operações são propostas,
podendo ser de 4 tipos:
•	1 X R: Atribuir o valor R a todos os números da linha X;
•	2 X R: Atribuir o valor R a todos os números da coluna X;
•	3 X: Imprimir o valor mais frequente na linha X;
•	4 X: Imprimir o valor mais frequente da coluna X.
Milli não é muito bom com computadores, mas é bastante preguiçoso. Sabendo que
você é um dos melhores programadores do mundo, ele precisa sua ajuda para
resolver este problema.
- Entrada
A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105),
representando, respectivamente, o tamanho do tabuleiro e a quantidade de
operações. As próximas Q linhas da entrada vão conter as Q operações. O
primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja 1 ou
2, será seguido por mais dois inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50). Caso
seja 3 ou 4, será seguido por apenas mais um inteiro X.
- Saída
Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha,
contendo o valor da resposta correspondente. Se uma linha ou coluna tiver
dois ou mais valores que se repetem o mesmo número de vezes, você deve
imprimir o maior deles. Por exemplo, se uma linha tem os valores
[5,7,7,2,5,2,1,3], tanto o 2, 5 e 7 se repetem duas vezes, então a resposta
será 7, pois é o maior deles. 

Exemplo de Entrada	Exemplo de Saída
2 4                 2

1 1 1               2

2 2 2

3 1

3 2
--------------------------------
3 6                 4

1 1 2               3

1 2 3

1 3 4

4 3

1 3 0

4 3
*/
