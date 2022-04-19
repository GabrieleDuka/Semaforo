public class ProduciDatoM extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    static int tanti = 5;
    final int attesa = 500;
    static int forI;

    public ProduciDatoM(Semaforo s1, Semaforo s2) {
        pieno = s1;
        vuoto = s2;
    }

    public void run() {
        for(int i = 0; i < tanti; i++) {
            forI = i;
            try {
                vuoto.p();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            App.buffer.raddoppia();
            System.out.println("Scrittore 2: dato scritto: " + i);
            pieno.v();
            try{
                Thread.sleep(attesa);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Scrittore 2: termina scrittura dati.");
    }
}
