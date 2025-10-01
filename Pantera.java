/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elsyj
 */
public class Pantera extends Animal implements Mascota {
    public Pantera(String nombre, int edad) {
        super(nombre, edad);
    }

    
    public void hacerSonido() {
        System.out.println(nombre + " ruge fuertemente.");
    }

   
    public void moverse() {
        System.out.println(nombre + " camina sigilosamente.");
    }

   
    public void jugar() {
        System.out.println(nombre + " juega acechando como si cazara.");
    }
}
