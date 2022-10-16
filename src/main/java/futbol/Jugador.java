
package futbol;

import static java.lang.Math.abs;


public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;
    
    public Jugador(String a, int b, String c, short d, byte e){
        super(a,b,c);
        golesMarcados = d;
        dorsal = e;
    }
    public Jugador(){
        super();
        golesMarcados = 289;
        dorsal = 7;
    }
    

    @Override
    public boolean jugarConLasManos() {
        return false;
    }
    @Override
    public int compareTo(Object o) {
       Jugador j = (Jugador)o;
       return abs(this.getEdad() - j.getEdad());
    }
    @Override
    public String toString(){
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
    
    
}
