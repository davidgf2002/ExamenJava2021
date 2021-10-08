package com.example.examenjava2021;

import java.util.List;

public class MedidaCO2 {

    //Declaración de los atributos
    private long tiempo;
    private int concentracionElectronica;
    private int concentracionTelematica;
    private int concentracionAula9;


    //Métodos Get y Set para acceder a los atributos
    public long getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getConcentracionElectronica() {
        return concentracionElectronica;
    }

    public void setConcentracionElectronica(int concentracionElectronica) {
        this.concentracionElectronica = concentracionElectronica;
    }

    public int getConcentracionTelematica() {
        return concentracionTelematica;
    }

    public void setConcentracionTelematica(int concentracionTelematica) {
        this.concentracionTelematica = concentracionTelematica;
    }

    public int getConcentracionAula9() {
        return concentracionAula9;
    }

    public void setConcentracionAula9(int concentracionAula9) {
        this.concentracionAula9 = concentracionAula9;
    }

    //Constructor
    public MedidaCO2(long tiempo, int concentracionElectronica, int concentracionTelematica, int concentracionAula9) {
        this.tiempo = tiempo;
        this.concentracionElectronica = concentracionElectronica;
        this.concentracionTelematica = concentracionTelematica;
        this.concentracionAula9 = concentracionAula9;
    }

    public static void main(String[] args) {

    }
}
