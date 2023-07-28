package com.jukarpenz.cert.prep.ocpjs17d.c6;

import java.io.IOException;

public class SuperClass {

    public static final String CLN = "Super Class - ";

    {
        System.out.println(CLN+"Instance segment ");
    }

    static {
        System.out.println(CLN+"Static");
    }

    public void superMethod(String s){

    }


    public CharSequence getCS(){
        return null;
    }

    public StringBuilder getSB(){
        return null;
    }

    public String getS() throws IOException {
        return null;
    }


    public SuperClass(){
        System.out.println(CLN+"constructor");
    }

}