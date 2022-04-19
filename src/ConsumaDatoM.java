public class ConsumaDatoM extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    Contatore dato;

    public ConsumaDatoM(Semaforo s1, Semaforo s2) {
        pieno= s1;
        vuoto = s2;
    }

    public void run() {
        Boolean loop = true;
        while(loop) {
            try {
                pieno.p();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            dato = App.buffer;
            System.out.println("Lettore 2: dato letto: " + dato.getValore());
            vuoto.v();
            if(ProduciDatoM.forI == (ProduciDatoM.tanti - 1)) {
                System.out.println("ultimo valore letto 2");
                loop = false;
            }
        }
    }
}
