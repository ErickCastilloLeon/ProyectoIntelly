package ProyectoLiga;

public class Jugador {


    private String nombre;
    private String nacionalidad;
    private int edad;
    private String posicion;
    private boolean lesionado;

    //Posición del jugador

    public enum valor { POR, DEF, CTC, DEL }

    private void setPosicion (String nuevoValor){
        this.posicion = nuevoValor;
    }

    public String getPosicion(){
        return this.posicion;
    }


    //Atributo lesionado y su valor

    public Jugador(){
        this.lesionado = false;
    }

    // valor lesionado
    public boolean getlesionado() {
        return this.lesionado;
    }

    // valor lesionarse
    public void lesionarse(){
        System.out.println("el jugador se ha lesionado!");
        this.lesionado = true;
    }

    // valor recuperarse

    public void recuperarse(){
        System.out.println("el jugador se a recuperado!");
        this.lesionado = false;
    }

    public static void Liga (String[]args){



    }


}
