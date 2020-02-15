package tablice;

import java.util.Scanner;

public class FibonacciRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input size of array:");
        int a = input.nextInt();
        long[] tablica = new long[a];
        for (int i = 0; i < tablica.length; i++) {
            if (i == 0 | i == 1) {
                tablica[i] = 1;
            } else {
                tablica[i] = tablica[i-1] + tablica[i - 2];
            }
            if(i==tablica.length-1){
                System.out.print(tablica[i]+".");
            }else{
                System.out.print(tablica[i]+", ");
            }

        }
    }
}
