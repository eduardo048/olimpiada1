/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package olimpiadas;

/**
 *
 * @author Ruben
 */
public class Vehiculo {
    private String velocidad;

    public Vehiculo() {
        int aleatorio = (int)(Math.random()*2); // Sacamos un numero entre 0 y 1 donde 1 la velocidad es alta y 0 es media
        
        if(aleatorio == 0){
            this.velocidad = "media";
        }
        else{
            this.velocidad = "alta";
        }
    }

    public String getVelocidad() {
        return velocidad;
    }
}
