package org.example;

import java.util.ArrayList;

public class Concesionario {


    private ArrayList<Auto> autos;
    public Concesionario() {
        autos = new ArrayList<>();
    }


    public void agregarAuto(Auto auto) {
        autos.add(auto);
    }


    public ArrayList<Auto> listarAutos() {
        return autos;
    }


    public void imprimirAutos(){
        for (Auto auto: autos){
            System.out.println(auto);
        }
    }
}