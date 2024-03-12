package org.example;

import java.util.ArrayList;


public class Auto {


    private String marca;
    private String modelo;


    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
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


    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
