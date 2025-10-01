/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elsyj
 */
public abstract class Cebra extends Animal implements Mascota {
    public Cebra(String nombre, int edad){
        super(nombre, edad);
      
    }
    public void hacerSonido(){
        System.out.println(getNombre()+"dice: ¡Bray bray!");
    }
    public void moverse(){
        System.out.println(getNombre()+"corre ");
    }
    public void jugar(){
        System.out.println(getNombre() + "juega en perseguir.");
    }
    
}
