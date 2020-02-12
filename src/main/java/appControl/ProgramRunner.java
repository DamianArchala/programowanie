package appControl;

import java.util.Scanner;

public class ProgramRunner {
    private static int AGE_LIMIT = 21;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wiek:");
        int age = input.nextInt();
        boolean result = AgeVerifer.isAdult(age,AGE_LIMIT);
        if(result==true){
            System.out.println("Osoba jest pełnoletnia!");
        }
        else
        {
            System.out.println("Osoba jest niepełnoletnia!");
        }

    }
}
