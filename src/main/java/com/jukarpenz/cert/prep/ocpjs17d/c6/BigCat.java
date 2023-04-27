package com.jukarpenz.cert.prep.ocpjs17d.c6;

public abstract class BigCat extends Animal {

    public Integer gola(String a){return null;}
    public Integer golo(String d){return 0;}
    public BigCat(){
        System.out.println("Big Cat constructor: " + this.getName());
        System.out.println("Big Cat constructor: " + getName());
    }

    abstract void roar();

}
