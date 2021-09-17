package co.parcial.dominio;

import java.util.Arrays;
import java.util.List;

public class TipoProducto {
    public static final String CARNE = "Carne";
    public static final String VERDURA = "Verdura";
    public static final String LACTEO ="Lacteo";
    public static final String FRUTA = "Fruta";
    public static final String PAN = "Pan";
    public static final String CEREAL ="Cereal";
    public static final String ACEITES = "Aceite";
    public static final List<String> tipos = Arrays.asList(CARNE, VERDURA, LACTEO, FRUTA, PAN, CEREAL, ACEITES);

    public List<String> getTipos() {
        return tipos;
    }
}
