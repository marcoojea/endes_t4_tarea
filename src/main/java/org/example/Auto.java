package org.example;

import java.util.ArrayList;

    /**
     * Dentro de la clase auto tenemos las clases marca y modelo
     * @author Marco Ojea
     * @#version 1.0
     */
public class Auto {
    //Atributos de la clase auto

    private String marca;
    private String modelo;


        /**
         * Constructor de auto
         * @param marca del coche (auto)
         * @param modelo del coche (auto)
         */
    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

        /**
         * Metodo que devuelve la marca del coche (auto)
         * @return marca
         */

    public String getMarca() {
        return marca;
    }

        /**
         * Metodo que actualiza la marca actual
         * @param marca del coche actualizada (auto)
         */
    public void setMarca(String marca) {
        this.marca = marca;
    }

        /**
         * Metodo que define el modelo del auto
         * @return modelo del coche (auto)
         */
    public String getModelo() {
        return modelo;
    }

        /**
         * Metodo que actualiza el modelo del coche (auto)
         * @param modelo del auto
         */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


        /**
         * Metodo que nos convierte un objeto de la clase Auto a un objeto de tipo String
         * @return cadena que representa los valores del Auto
         */
    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", modelo=" + modelo + "]";
    }
}
