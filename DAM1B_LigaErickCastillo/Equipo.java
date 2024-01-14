package DAM1B_LigaErickCastillo;
public class Equipo {
    public String nombre;
    public String ciudad;
    public static final int NUM_MAX_JUGADORES = 22;
    public Jugador[] listaJugadores;

    // Constructor
    public Equipo() {
        // Al crearse un objeto del tipo equipo, se crea el listado de jugadores con elementos nulos
        listaJugadores = new Jugador[NUM_MAX_JUGADORES];
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getNumJugadores() {
        int numJugadores = 0;
        for (Jugador jugador : listaJugadores) {
            if (jugador != null) {
                numJugadores++;
            }
        }
        return numJugadores;
    }

    public void mostrarListaJugadores() {
        System.out.println("Lista de Jugadores:");
        for (Jugador jugador : listaJugadores) {
            if (jugador != null) {
                System.out.println(jugador.getNombre());
            }
        }
    }

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
                break;
            }
        }
    }
}
