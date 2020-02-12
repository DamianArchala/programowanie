import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj rozmiar kwadratu:");
        int size = input.nextInt();
        for(int i = 1; i<=size; i++){
            if(i==1 | i==size)
            {
                for(int k = 0; k<size; k++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            else
            {
                for(int j = 1; j<=size; j++)
                {
                    if(j==1 | j==size) {
                        System.out.print("*");
                    }
                    else{
                        for(int k = 0; k<size-2; k++) {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println("");
            }
        }
    }
}
