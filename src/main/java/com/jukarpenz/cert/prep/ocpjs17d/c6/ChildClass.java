package com.jukarpenz.cert.prep.ocpjs17d.c6;

import java.io.FileNotFoundException;

public class ChildClass extends SuperClass {

    public static final String CLN = "Child Class - ";
    public String name = "";

    {
        System.out.println(CLN+"Instance segment ");
        name = "This Child";
    }

    static {
        System.out.println(CLN+"Static");
    }

    public ChildClass(){
        System.out.println(CLN+"constructor");
    }

    public static void main (String[] args) {

        System.out.println("Hi " + CLN);
        System.out.println("New object");
        new ChildClass();
        System.out.println("New object");
        new ChildClass();
    }

    public static void testOut(){
        System.out.println(CLN+"Iniciando testOut");
    }

    public String getC(){
        return null;
    }

    public String getS() throws FileNotFoundException {
        return null;
    }

    public StringBuilder getSB(){
        return null;
    }

}