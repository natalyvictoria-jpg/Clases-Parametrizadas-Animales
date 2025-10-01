/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author elsyj
 */
public abstract class Animal {
String nombre;
private int edad;

public Animal(String nombre, int edad){
    this.nombre = nombre;
    this.edad = edad;
}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
//Metodos abastractos
    public abstract void hacerSonido();
    public abstract void moverse();
}

    

  
   

      
  
          
          
    
  
    

