
package futbol;

public abstract class Futbolista implements Comparable {
    
    private String nombre;
    private int edad;
    private final String posicion;
    
    public Futbolista(String a, int b, String c){
        nombre = a;
        edad = b;
        posicion = c;
    }
    public Futbolista(){
        nombre = "Maradona";
        edad = 30;
        posicion = "delantero";
    }
    
    
    @Override
    public int compareTo(Object o){
        return 0;
    }
    @Override
    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }
    
    public boolean equals(Futbolista f){
        return f == this;
    }
    
    public abstract boolean jugarConLasManos();
    
    public void setNombre(String i){
     nombre = i;
}
    public void setEdad(int i){
        edad = i;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public String getPosicion(){
        return posicion;
    }
}


