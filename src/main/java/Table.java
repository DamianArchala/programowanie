public class Table {
    public static void main(String[] args) {
        int[] table = new int[] {0,1,2,3,4,5,6,7,8,9};
        int[] table2 = new int[] {0,1,2,3,4,5,6,7,8,9};
//        System.out.println("Wszystkie:");
        int sum = 0;
        for(int i = 0; i<table.length; i++)
        {
            if(table[i]%3==0){
                sum = sum + table2[i];
                if(i<table.length-1){
                    System.out.print(table2[i] + " + ");
                }
                else
                {
                    System.out.print(table2[i]);
                }
            }
        }
        System.out.print(" = " + sum);
//        System.out.println("\nWszystkie, a co druga suma z poprzednim");
//        for(int i = 0; i<table2.length; i++)
//        {
//            if(i%2!=0) table2[i] = table2[i] + table2[i-1];
//            System.out.print(table2[i] + " ");
//        }
//        System.out.println("\nWszystkie od końca: ");
//        for (int i = table2.length-1; i>=0; i--)
//        {
//            System.out.print(table2[i]+" ");
//        }
//        System.out.println("\nWszystkie nieparzyste pozycje:");
//        for (int i = 0; i<table2.length; i++)
//        {
//            if(i%2!=0) System.out.print(table2[i]+" ");
//        }
//        System.out.println("\nSuma wszystkich poprzednich wartości dla każdego elementu");
//        for (int i = 0; i<table2.length; i++)
//        {
//            int suma = 0;
//            for(int j = 0; j<=i; j++)
//            {
//                suma += table[j];
//            }
//            System.out.print (suma+ " ");
//        }


    }
}
