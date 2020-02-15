import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Wyraz1");
        lista.add("Wyraz2");
        lista.add("Wyraz3");
        lista.add("Wyraz4");
        lista.add("Wyraz5");

        System.out.println("Rozmiar listy: " + lista.size() + ".");

        lista.remove("Wyraz5");

        System.out.println("Po usunięciu elementu: Wyraz5, lista ma rozmiar: " + lista.size() + ".");

        lista.remove(1);

        System.out.println("Po usunięciu elementu drugiego (indeks=1), rozmiar listy wynosi: "+lista.size()+".");

        System.out.println("Lista:\n"+lista.get(0)+"\n"+lista.get(1)+"\n"+lista.get(2));
    }
}
