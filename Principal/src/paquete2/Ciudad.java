
package paquete2;


public class Ciudad {
    private String nombre;
    private String provincia;

    public Ciudad(String n, String p) {
        nombre = n;
        provincia = p;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerProvincia(String n) {
        provincia = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerProvincia() {
        return provincia;
    }
}
