package DAM1B_LigaErickCastillo;

public class Equipo {
    private String nombre;
    private String ciudad;
    public static final int NUM_MAX_JUGADORES = 22;
    private Jugador[] listaJugadores;

    // Constructor
    public Equipo() {
        // Al crearse un objeto del tipo equipo, se crea el listado de jugadores con elementos nulos
        listaJugadores = new Jugador[NUM_MAX_JUGADORES];
    }

    // Métodos de acceso
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    // Métodos adicionales
    // ...

    public void adquirirJugador(Jugador jugador) {
        for (int i = 0; i < listaJugadores.length; i++) {
            if (listaJugadores[i] == null) {
                listaJugadores[i] = jugador;
                System.out.println("Jugador adquirido: " + jugador.getNombre());
                break;
            }
        }
    }

    public void venderJugador(String nombreJugador) {
        for (int i = 0; i < listaJugadores.length; i++) {
            if (listaJugadores[i] != null && listaJugadores[i].getNombre().equals(nombreJugador)) {
                System.out.println("Jugador vendido: " + listaJugadores[i].getNombre());
                listaJugadores[i] = null;
                return;
            }
        }
        System.out.println("El jugador '" + nombreJugador + "' no se encontró en el equipo.");
    }
}
