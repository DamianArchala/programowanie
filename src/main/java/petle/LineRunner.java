package petle;

import java.util.Scanner;

public class LineRunner {
    public static void main(String[] args) {
        Symbol line = new Symbol();
        Scanner input = new Scanner(System.in);
        System.out.println("Input line size:");
        line.size = input.nextInt();
        System.out.println("Input string of line build:");
        line.type = input.next();
        for (int i = 0; i < line.size ; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==i) line.printString(line.type);
                if(j!=i) System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
