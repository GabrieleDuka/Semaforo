public class App {
    protected static Contatore buffer = new Contatore();
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod = new ProduciDato(pieno, vuoto);
        ConsumaDato cons = new ConsumaDato(pieno, vuoto, 1);
        ConsumaDato cons2 = new ConsumaDato(pieno, vuoto, 2);
        ConsumaDato cons3 = new ConsumaDato(pieno, vuoto, 3);
        prod.start();
        cons.start();
        cons2.start();
        cons3.start();
    }
}
