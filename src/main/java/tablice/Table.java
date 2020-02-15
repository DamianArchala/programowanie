package tablice;

public class Table {
    public static void main(String[] args) {
//        PrintTable[] table = new PrintTable[10];
        int[] table = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] table2 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        odKonca(table);
        parzyste(table2);
        sumaPoprzednich(table);
        sumaWiekszychOd5(table2);
    }

    public static void odKonca(int[] table) {
        for (int i = 9; i > 0; i--) {
            System.out.print(table[i] + ", ");
        }
        System.out.println();
    }

    public static void parzyste(int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (i % 2 != 0) System.out.print(table[i] + ", ");
        }
        System.out.println();
    }

    public static void sumaPoprzednich(int[] table) {
        for (int i = 0; i < table.length; i++) {
            int a = 0;
            for (int j = 0; j <= i; j++) {
                a += table[j];
            }
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    public static void sumaWiekszychOd5(int[] table) {
        for (int i = 0, a = 0; i < table.length; i++) {
            if (table[i] > 5) a += table[i];
            if (i == table.length - 1) System.out.println(a);
        }
    }
}

