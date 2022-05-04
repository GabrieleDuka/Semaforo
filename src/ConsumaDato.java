public class ConsumaDato extends Thread{
    Semaforo pieno;
    Semaforo vuoto;
    Contatore dato;
    Boolean loop2 = true;
    int i = 0;
    int num;

    public ConsumaDato(Semaforo s1, Semaforo s2, int c) {
        pieno= s1;
        vuoto = s2;
        num = c;
    }

    public void run() {
        try {
            pieno.p();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while(loop2) {
            if(App.buffer.getValore(i) == 0) {
                System.out.println("C" + num + ": Consumato valore pos " + i);
                App.buffer.decrementa(i);
                loop2 &= false;
            }
        }
        vuoto.v();
    }
}
