public class App {
    protected static Contatore buffer = new Contatore(0);
    public static void main(String[] args) {
        Semaforo pieno = new Semaforo(0);
        Semaforo vuoto = new Semaforo(1);
        ProduciDato prod = new ProduciDato(pieno, vuoto);
        ProduciDatoM prodM = new ProduciDatoM(pieno, vuoto);
        ConsumaDato cons = new ConsumaDato(pieno, vuoto);
        ConsumaDatoM consM = new ConsumaDatoM(pieno, vuoto);
        prod.start();
        cons.start();
        prodM.start();
        consM.start();
    }
}
