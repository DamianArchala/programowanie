package petle;

import java.util.Scanner;

public class CrossRunner {
    public static void main(String[] args) {
        Symbol cross = new Symbol();
        Scanner input = new Scanner(System.in);
        System.out.println("Input cross size:");
        cross.size = input.nextInt();
        System.out.println("Input string of cross build:");
        cross.type = input.next();
        for (int i = 1; i <=cross.size; i++) {
            for (int j = 1; j <=cross.size ; j++) {
                if(i==j | i+j==cross.size+1) {
                    cross.printString(cross.type);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
