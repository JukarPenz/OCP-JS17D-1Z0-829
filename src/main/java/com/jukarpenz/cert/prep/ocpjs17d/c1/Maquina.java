package com.jukarpenz.cert.prep.ocpjs17d.c1;

public class Maquina {

    public static void main(String[] args) {
        System.out.println("Estas en main Maquina");
        prueba();
    }

    public static void prueba(){
        System.out.println("Prueba static Maquina");
    }

    public void probar(){
        System.out.println("No static Maquina");
    }

}

class Auto extends Maquina implements Comparable<Integer>{

    public static void main(String[] args) {
        Maquina ma = new Auto();
        ma.prueba();
        ma.probar();

        Auto au = new Auto();
        au.prueba();
        au.probar();
    }

    public static void prueba(){
        System.out.println("Prueba static auto");
    }

    @Override
    public void probar(){
        System.out.println("No static Auto");
    }

    @Override
    public int compareTo(Integer integer) {
        return 0;
    }
}
