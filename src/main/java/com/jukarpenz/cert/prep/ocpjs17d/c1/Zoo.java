package com.jukarpenz.cert.prep.ocpjs17d.c1;
//compile manually

public class Zoo {

    public static final void main(String[] as) {
        System.out.println("This is the Zoo");
        System.out.println(as[0]);
        System.out.println(as[1]);
        if(as.length>2){
            System.out.println("This is third: "+as[3]);
        }
        else{
            System.out.println("Don't have third");
        }
    }
}
