package co.parcial.app;

import co.parcial.dominio.CarritoDeMercado;
import co.parcial.dominio.Producto;

public class App {
    public static void main(String[] args) {
        CarritoDeMercado camilo = new CarritoDeMercado();
        Producto leche = new Producto("leche",2000,"lacteos");
        Producto arroz = new Producto("arroz", 1500,"cereal");
        Producto detergente = new Producto("jabón", 3000,"limpieza");
        camilo.agregar(leche);
        camilo.agregar(arroz);
        camilo.agregar(detergente);
        for (Producto producto: camilo.getProductos()) {
            System.out.println("-"+producto.getNombre()+"\n-"+producto.getPrecio()+"\n-"+producto.getTipo()+"\n");
            System.out.println("\n");
        }
        for (Producto producto: camilo.buscarPorTipo("cereal")) {
            System.out.println("-"+producto.getNombre()+"\n-"+producto.getPrecio()+"\n-"+producto.getTipo()+"\n");
            System.out.println("\n");
        }
        System.out.println(camilo.caldularValorTotal());
        camilo.obtenerProductoMasCaro();
        camilo.sacar("leche");
    }
}
