package co.parcial.dominio;

public class Producto implements Comparable<Producto>{
    private String nombre;
    private int precio;
    private String tipo;

    public Producto(String nombre, int precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public int compareTo(Producto o) {
        if(this.precio < o.getPrecio()){
            return 1;
        }
        else{
            if(this.precio == o.getPrecio()){
                return 0;
            }
            else{
                return -1;
            }
        }
    }
}
