
package futbol;

import static java.lang.Math.abs;


public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;
    
    public Portero(String a, int b, short d, byte e){
        super(a,b,"Portero");
        golesRecibidos = d;
        dorsal = e;
    }
  /*  public Portero(){
        super();
        golesRecibidos = 289;
        dorsal = 7;
    } */

    @Override
    public int compareTo(Object o) {
        Portero p = (Portero)o;
        return abs(golesRecibidos - p.golesRecibidos);
    }
    @Override
    public boolean jugarConLasManos() {
        return true;
    }
    @Override
    public String toString(){
        return super.toString() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos;
    }
}
