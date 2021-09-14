package co.parcial.dominio;

import java.util.Arrays;
import java.util.List;

public class TipoProducto {
    public String CARNE = "Carne";
    public String VERDURA = "Verdura";
    public String LACTEO ="Lacteo";
    public String FRUTA = "Fruta";
    public String PAN = "Pan";
    public String CEREAL ="Cereal";
    public String ACEITES = "Aceite";
    public List<String> tipos = Arrays.asList(CARNE, VERDURA, LACTEO, FRUTA, PAN, CEREAL, ACEITES);

    public List<String> getTipos() {
        return tipos;
    }
}
