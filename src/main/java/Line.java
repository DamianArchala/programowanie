import java.util.Scanner;

public class Line {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj rozmiar linii:");
        int size = input.nextInt();
        for(int i = 0; i<=size; i++){
            for(int j = 0; j<i; j++){
                if(j+1==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
