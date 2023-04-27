package com.jukarpenz.cert.prep.ocpjs17d.c6;

public class Lion extends BigCat {

    @Override
    public Integer golo(String d){return null;}
    //@Override
    public Integer gola(Character a){return 0;}

    //public void golo(String a){return ;}

    public Lion(){
        System.out.println("Lion Constructor: "  + this.getName());
    }

    public String getName(){return "Simba";}

    void roar(){System.out.println("Roar like "+getName()+"!");}

    final static String specie="BigC Specie";
}
