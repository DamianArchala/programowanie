package Choinka;

import java.util.Scanner;

public class TreeRunner {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Scanner input = new Scanner(System.in);
        System.out.println("Input tree height:");
        tree.size = input.nextInt();
        System.out.println("Input tree type:");
        tree.type = input.next();
        for (int i = 0; i <= tree.size; i++) {
            for (int k = 0; k < ((tree.size*2)-((i * 2) - 1))/2; k++) {
                for (int j = 0; j <tree.type.length(); j++) {
                    System.out.print(" ");
                }
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print(tree.type);
            }
            System.out.println();
        }
    }
}
