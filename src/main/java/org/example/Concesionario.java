package org.example;

import java.util.ArrayList;
    /**
     * Clase concesionario
     * @author Marco Ojea
     * @version 1.0
     */
public class Concesionario {
    /**
     * ArrayList o Lista de los autos (coches)
     */
    private ArrayList<Auto> autos;

        /**
         * Constructor de la lista de concesionarios
         */
    public Concesionario() {
        autos = new ArrayList<>();
    }

        /**
         *
         * @param auto añadimos un coche a la lista de concesionario
         */

    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }

        /**
         *
         * @return La lista de los coches actualizada
         */
    public ArrayList<Auto> listarAutos() {
        return autos;
    }

        /**
         * Imprime los coches de la lista de coches
         */
    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}