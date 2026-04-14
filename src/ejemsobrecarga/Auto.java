/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemsobrecarga;

/**
 *
 * @author UCC20311
 */
public class Auto {
    private String placa;
    private String marca;
    private String modelo;
    private double kilometraje;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Auto() {
    }

    public Auto(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void verDatos(){
        System.out.println("Auto\nPlaca: "+this.placa+"\nMarca: "+this.marca+"\nModelo: "+this.modelo+"\nKilometraje: "+this.kilometraje);
    }
}
