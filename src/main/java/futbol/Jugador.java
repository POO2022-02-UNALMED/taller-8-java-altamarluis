/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import static java.lang.Math.abs;

/**
 *
 * @author LENOVO
 */
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
    public int compareTo(Futbolista o) {
       return abs(this.getEdad() - o.getEdad());
    }
    @Override
    public String toString(){
        return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
    }
    
    
}
