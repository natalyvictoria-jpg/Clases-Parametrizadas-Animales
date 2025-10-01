/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author elsyj
 */
public class Mian {
    public static void main(String[] args) {
        Cebra cebra = new Cebra("Rayitas", 4) {};
        Pantera pantera = new Pantera("Sombra", 5);
        Delfin delfin = new Delfin("Ariel", 6) {};

        cebra.hacerSonido();
        cebra.moverse();
        cebra.jugar();

        pantera.hacerSonido();
        pantera.moverse();
        pantera.jugar();

        delfin.hacerSonido();
        delfin.moverse();
    }
}

