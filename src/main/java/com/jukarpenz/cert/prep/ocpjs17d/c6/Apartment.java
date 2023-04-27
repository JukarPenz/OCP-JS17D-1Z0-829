package com.jukarpenz.cert.prep.ocpjs17d.c6;

import com.jukarpenz.cert.prep.ocpjs17d.c6.sub.Good;
import com.jukarpenz.cert.prep.ocpjs17d.c6.sub.SuperProperty;

abstract public class Apartment extends Good {

    public static void main(String[] args) {


        //SuperProperty sp = new Property();
        //sp.Property();
        //sp.getId(5);

        //new Property();
        System.out.println("-----------");
        //new Apartment();
        Property.staticMethod();
        System.out.println("-------------------");
        //new Property();
        System.out.println("-------------------");
//        new Property();
        System.out.println("-------------------");
//        System.out.println(new Property().sld);
        System.out.println("Property ID: " + Property.ID);
        Property p = new Property();
        SuperProperty sps = p;//new Property();
        sps.Property();
        System.out.println();
//        System.out.println("Property ID: " + );
//        System.out.println("Good ID: " + Good.ID);
//        System.out.println("Good ID: " + ID);
    }

    private Apartment(){
        System.out.println("Apart Constructor");
    }

    {
        System.out.println("Apart block");
    }

    static{
        System.out.println("Apart static");
    }

}
