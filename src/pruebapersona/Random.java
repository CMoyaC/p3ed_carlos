/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapersona;

/**
 *
 * @author Carlos
 */
public class Random {
    private int random;
    private String nombre;

    public Random(){
    
    }
    
    public Random(int random, String nombre) {
        this.random = random;
        this.nombre = nombre;
    }

    public int getRandom() {
        return random;
    }

    public void setRandom(int random) {
        this.random = random;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
