import java.util.ArrayList;

public class Contatore {
    ArrayList<Integer> valore;
    int i = 0;

    public Contatore() {
        System.out.println("Il contatore è nato");
    }
    public int getValore(int index) {
        return valore.get(index);
    }

    void incrementa() {
        valore.set(i, 1);
        System.out.println("Prodotto pos " + i + " = 1");
        i++;
        if(i > 9) {
            i = 0;
        }
    }
    void decrementa(int passo) {
        valore.set(passo, 0);
    }
}
