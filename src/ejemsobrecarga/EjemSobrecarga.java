/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemsobrecarga;

/**
 *
 * @author UCC20311
 */
public class EjemSobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Calculadora");
        Calculadora cal = new Calculadora();
        cal.sumar(3, 2);
        cal.sumar(5, 7, 8);
        cal.sumar(12, 10, 9, 10);
        
        Calculadora.multiplicar(1, 5);
        Calculadora.multiplicar(6, 5, 3);
        Calculadora.multiplicar(7, 5, 2, 10);
        
        
        System.out.println("\nCreando objeto Auto: ");
        Auto auto1 = new Auto("KHV-9876","Toyota","Hilux");
        auto1.verDatos();
        
        Auto auto2 = new Auto();
        auto2.verDatos();
        System.out.println("Version 1.2");
    }
    
}
