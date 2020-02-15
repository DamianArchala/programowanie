package tablice;

public class Table {
    public static void main(String[] args) {
        PrintTable[] table = new PrintTable[10];    //deklaracja tablicy jako obiekt
        PrintTable[] table2 = new PrintTable[10];    //deklaracja tablicy2 jako obiekt
        PrintTable[] table3 = new PrintTable[10];    //deklaracja tablicy3 jako obiekt
        for (int i = 0; i < 10; i++) {
            table[i] = new PrintTable();
            table[i].value = i;
        }
    }
}
