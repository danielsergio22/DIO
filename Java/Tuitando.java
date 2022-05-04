package DIO.Java;

import java.util.Scanner;

public class Tuitando {
    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        if(text.length() <= 140) System.out.println("TWEET");
        else System.out.println("MUTE");
        scan.close();
    }
}