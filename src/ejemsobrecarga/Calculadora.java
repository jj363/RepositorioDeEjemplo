/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemsobrecarga;

/**
 *
 * @author UCC20311
 */
public class Calculadora {
    public void sumar(int a, int b){
        System.out.println("La suma es: " + (a+b) );
    }
    public void sumar(int a, int b, int c){
        System.out.println("La suma es: " + (a+b+c) );
    }
    public void sumar(int a, int b, int c, int d){
        System.out.println("La suma es: " + (a+b+c+d) );
    }
    public static void multiplicar(int a, int b) {
        System.out.println("La multiplicacion es: "+(a*b));
    }
    public static void multiplicar(int a, int b, int c) {
        System.out.println("la multiplicacion es: "+(a*b*c));
    }
    public static void multiplicar(int a, int b, int c, int d) {
        System.out.println("La multiplicacion es: "+(a*b*c*d));
    }
}
