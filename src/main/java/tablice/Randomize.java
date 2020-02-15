package tablice;

import java.util.Scanner;
import java.util.Random;

public class Randomize {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wielkosc tablicy:");
        int size = input.nextInt();
        System.out.println("Podaj dolną granicę losowania:");
        int a = input.nextInt();
        System.out.println("Podaj górną granicę losowania:");
        int b = input.nextInt();
        int[] tablica = new int[size];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = (rand.nextInt(a) + b);
            System.out.println(tablica[i]);
        }
    }
}
