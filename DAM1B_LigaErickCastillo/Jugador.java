package DAM1B_LigaErickCastillo;

public class Jugador {


    public String nombre;
    public String nacionalidad;
    public int edad;
    public String posicion;
    public boolean lesionado;

    //Los get mencionados del diagrama


    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() { //
        return posicion;
    }


    //Posición del jugador

    public enum valor { POR, DEF, CTC, DEL }

    private void setPosicion (String nuevoValor){
        this.posicion = nuevoValor;
    }

    public String getposicion(){
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
        System.out.println(" El jugador esta lesiona! ");
        this.lesionado = true;
    }

    // valor recuperarse

    public void recuperarse(){
        System.out.println(" El jugador se a recuperado! ");
        this.lesionado = false;
    }

     public static void Liga (String[]args){

    }


}