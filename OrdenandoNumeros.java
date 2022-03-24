package DIO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenandoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();
        int n, num;
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            num = sc.nextInt();
            if(num % 2 == 0){
            pares.add(num);
            } else impares.add(num);
        }
        Collections.sort(pares);
        Collections.sort(impares);
        Collections.reverse(impares);
        for(int par : pares) System.out.println(par);
        for(int impar : pares) System.out.println(impar);
        sc.close();
    }
}