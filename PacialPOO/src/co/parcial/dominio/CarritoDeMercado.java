package co.parcial.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarritoDeMercado {
    public static final byte CAPACIDAD = 20;
    private String supermercado;
    private List<Producto> productos = new ArrayList<>();

    public boolean agregar(Producto p){
        if(p != null){
            if(this.productos.size()<CAPACIDAD){
                productos.add(p);
                return true;
            }
            return false;
        }
        return false;
    }
    public Producto buscar(String nombre){
        Producto productoBuscado = null;
        for (Producto producto : this.productos) {
            if(producto.getNombre().equalsIgnoreCase(nombre)){
                productoBuscado = producto;
                break;
            }
        }
        return productoBuscado;
    }
    public List<Producto> buscarPorTipo(String tipo){
        List<Producto> productosPorTipo = new ArrayList<>();
        TipoProducto tipoProducto = new TipoProducto();
        for (String t:tipoProducto.getTipos()) {
            if(t.equalsIgnoreCase(tipo)){
                for (Producto producto : this.productos) {
                    if(producto.getTipo().equalsIgnoreCase(tipo)){
                        productosPorTipo.add(producto);
                    }
                }
            }
        }
        return productosPorTipo;
    }
    public boolean sacar(String nombre){
        Producto productoASacar = buscar(nombre);
        if(productoASacar != null){
            this.productos.remove(productoASacar);
            return true;
        }
        return false;
    }
    public int caldularValorTotal(){
        int valorTotal = 0;
        for (Producto producto : this.productos) {
            valorTotal += producto.getPrecio();
        }
        return valorTotal;
    }
    public Producto obtenerProductoMasCaro(){
        Collections.sort(productos);
        return productos.get(0);
    }

    public String getSupermercado() {
        return supermercado;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
