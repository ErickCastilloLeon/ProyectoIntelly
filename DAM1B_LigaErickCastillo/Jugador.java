package DAM1B_LigaErickCastillo;

public class Jugador {

    //Los cambie a private
    private String nombre;
    private String nacionalidad;
    private int edad;
    private valor posicion;
    private boolean lesionado;


    // Constructor
    public Jugador() {
        this.lesionado = false;
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public valor getPosicion() {
        return posicion;
    }

    // Métodos adicionales
    // Enum para la posición del jugador
    public enum valor { POR, DEF, CTC, DEL }

    // Métodos para lesionado
    public boolean getLesionado() {
        return this.lesionado;
    }

    public void lesionarse() {
        System.out.println("El jugador está lesionado.");
        this.lesionado = true;
    }

    public void recuperarse() {
        System.out.println("El jugador se ha recuperado.");
        this.lesionado = false;
    }

    public static void main(String[] args) {
        // Código principal si es necesario
    }


}
