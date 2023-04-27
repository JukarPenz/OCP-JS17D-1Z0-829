package com.jukarpenz.cert.prep.ocpjs17d.c6;

import com.jukarpenz.cert.prep.ocpjs17d.c6.sub.Carnivore;

public class Merrkat extends  Carnivore{

    protected String NSID="Proper 3";
    protected int mount;

    protected boolean fs = true;

    protected boolean hasFur =  true;
    public static void main(String[] args) {
        Merrkat m = new Merrkat();
        Carnivore c = m;
        System.out.println(m.NSID);
//        System.out.println(c.NSID);
    }
}