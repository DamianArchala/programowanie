package petle;

import java.util.Scanner;

public class SquareRunner {
    public static void main(String[] args) {
        Symbol square = new Symbol();
        Scanner input = new Scanner(System.in);
        System.out.println("Input square size:");
        square.size = input.nextInt();
        System.out.println("Input string of square build:");
        square.type = input.next();
        for (int i = 1; i <= square.size ; i++) {
            for (int j = 1; j <= square.size; j++) {
                if (i==1 | i==square.size | j==1 | j==square.size)
                {
                    square.printString(square.type);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}
