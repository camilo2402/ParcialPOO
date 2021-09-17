package co.parcial.app;

import co.parcial.dominio.CarritoDeMercado;
import co.parcial.dominio.Producto;

public class App {
    public static void main(String[] args) {
        CarritoDeMercado camilo = new CarritoDeMercado("olimpica");
        Producto leche = new Producto("leche",2000,"lacteos");
        Producto arroz = new Producto("arroz", 1500,"cereal");
        Producto detergente = new Producto("jabón", 3000,"limpieza");
        Producto cereal = new Producto("Zucaritas",15000,"cereal");
        Producto libro = new Producto("libro", 85000,"libro");
        camilo.agregar(libro);
        camilo.agregar(cereal);
        camilo.agregar(leche);
        camilo.agregar(arroz);
        camilo.agregar(detergente);
    }
}
