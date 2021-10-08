package com.example.examenjava2021;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalidadAire {
    // Hora local Gandia Epoch del 7.10.2021 de las 8:00 am a las 17:00 pm
    static long FECHA[]={1633586400000L, 1633590000000L, 1633593600000L, 1633597200000L, 1633600800000L, 1633604400000L, 1633608000000L,1633611600000L, 1633615200000L, 1633618800000L};

    // Mediciones de la concentración de CO2 (calidad del aire en partículas por millón, ppm) en las aulas
    static int ELECTRONICA[] = {500, 650, 700, 850, 875, 600, 550, 650, 850, 600};
    static int TELEMATICA[] = {450, 500, 675, 875, 850, 700, 750, 880, 700, 600};
    static int AULA9[] = {450, 500, 550, 650, 700, 800, 750, 600, 650, 600};

    private long fecha;
    private int electronica;
    private int telematica;
    private int aula9;


    //Constructor
    public CalidadAire(long fecha, int electronica, int telematica, int aula9) {
        this.fecha = fecha;
        this.electronica = electronica;
        this.telematica = telematica;
        this.aula9 = aula9;
    }

    //Getters y Setters
    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public int getElectronica() {
        return electronica;
    }

    public void setElectronica(int electronica) {
        this.electronica = electronica;
    }

    public int getTelematica() {
        return telematica;
    }

    public void setTelematica(int telematica) {
        this.telematica = telematica;
    }

    public int getAula9() {
        return aula9;
    }

    public void setAula9(int aula9) {
        this.aula9 = aula9;
    }


    //Método Main()
    public static void main(String[] args) {

        List<MedidaCO2> datos = new ArrayList<>();
        for (int i=0; i< FECHA.length; i++){
            datos.add(new MedidaCO2(FECHA[i], ELECTRONICA[i], TELEMATICA[i],AULA9[i]));
        }
        System.out.println(datos);

        List<MedidaCO2> medidasPPM = new ArrayList<>();
        for(MedidaCO2 puntero:datos){
            medidasPPM.add(datos.getElectronica(), datos.getTelematica(), datos.getAula9());
        }
        System.out.println(medidasPPM);


        Map<String,Integer> mapeado= new HashMap<>();
        int contadorElectronica = 0;
        int contadorTelematica = 0;
        int contadorAula9 = 0;
        for(MedidaCO2 puntero:datos){
            if(datos.getElectronica()>800){
                contadorElectronica++;
            }
            if(datos.getTelematica()>800){
                contadorElectronica++;
            }
            if(datos.getAula9()>800){
                contadorElectronica++;
            }
            System.out.println(mapeado);
        }
    }

}
