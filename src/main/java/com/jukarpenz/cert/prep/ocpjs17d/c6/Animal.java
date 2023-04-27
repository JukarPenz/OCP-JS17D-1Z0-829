package com.jukarpenz.cert.prep.ocpjs17d.c6;

abstract public class Animal {

    public Animal(){
        System.out.println("Animal constructor " + this.getName());
        System.out.println("Animal constructor " + getName());
    }
    abstract public String getName();

    private void  golo(){return;}
}


