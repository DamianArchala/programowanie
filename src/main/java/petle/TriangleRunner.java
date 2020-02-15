package petle;

import java.util.Scanner;

public class TriangleRunner {
    public static void main(String[] args) {
        Symbol triangle = new Symbol();
        Scanner input = new Scanner(System.in);
        System.out.println("Input triangle size:");
        triangle.size = input.nextInt();
        System.out.println("Input char of triangle build:");
        triangle.type = input.next();
        for (int i = 0; i < triangle.size ; i++) {
            for (int j = 0; j <= i; j++) {
                triangle.printString(triangle.type);
            }
            System.out.println("");
        }
    }
}
