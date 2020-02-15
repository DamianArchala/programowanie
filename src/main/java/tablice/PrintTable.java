package tablice;

public class PrintTable {
    int value;

    public void stworzTablice(int[] table) {

    }

    void odKonca(int[] table) {
        for (int i = 10; i > 0; i--) {
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    void parzyste(int[] table) {
        for (int i = 0; i < table.length; i++) {
            if (i % 2 == 0) System.out.print(table[i] + ", ");
        }
        System.out.println();
    }

    void sumaPoprzednich(int[] table) {
        for (int i = 0; i < table.length; i++) {
            int a = 0;
            for (int j = 0; j <= i; j++) {
                a += table[j];
            }
            System.out.print(a + ", ");
        }
        System.out.println();
    }

    void sumaWiekszychOd5(int[] table) {
        for (int i = 0, a = 0; i < table.length; i++) {
            if (table[i] > 5) a += table[i];
            if (i == table.length - 1) System.out.println(a);
        }
    }
}
