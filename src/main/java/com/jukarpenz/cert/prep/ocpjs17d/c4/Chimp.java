package com.jukarpenz.cert.prep.ocpjs17d.c4;

import static com.jukarpenz.cert.prep.ocpjs17d.c4.oth.Rope.*;

import com.jukarpenz.cert.prep.ocpjs17d.c4.oth.*;
import com.jukarpenz.cert.prep.ocpjs17d.c6.Apartment;

abstract class Chimp {

    public static void main(String[] args) {

        Rope.swing();
        new Rope().swing();
        new Rope().LENGTH=3;
        System.out.println(LENGTH);

        varTest(2);
        varTest(2,4);
    }

    static void varTest(int i, int...is){
        System.out.println("vararg");
    }
    static void varTest(int i){
        System.out.println("simple");
    }

}
