public class ProduciDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    final int attesa = 500;

    public ProduciDato(Semaforo s1, Semaforo s2) {
        pieno = s1;
        vuoto = s2;
    }

    public void run() {
        try {
            vuoto.p();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        App.buffer.incrementa();
        pieno.v();
        try{
            Thread.sleep(attesa);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
