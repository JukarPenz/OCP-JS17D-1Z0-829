package com.jukarpenz.cert.prep.ocpjs17d.c4;

import java.time.*;

public class Timing {

//    static final private String lol;
    static {
//
    }
    public static void main(String[] args) {

        long df = Integer.valueOf(3);
        Integer i = 0;
        modInt(i);
        System.out.println(i);


        if(false && args!=null&&args.length<13){
            System.out.println("Recurso " + (args.length+1));
            //return;
        }
        else{
//            Timing.timing();
            //return;
        }

//        Timing tm = new Timing();
//        tm.n="John";
//        modOb(tm);
//        System.out.println(tm.n);
//
//        String sf = "Hello";
//        modStr(sf);
//        System.out.println(sf);
//        timing();



    }

    static void rocArr(int...as){
        final int e ;

        e= 3;
    }

    public String n;

    static void modInt(Integer i){
        i++;
    }

    static void modOb(Timing t){
        Character df = 'l';
        t.n="Modi " + t.n;
        System.out.println("MODOB");
    }
    static void modStr(String s){
        s="Adios ";
        System.out.println(s);
    }

//    static final int dddd=2;

    static private final void timing(){

        var jk = new StringBuilder("Jukar");
        System.out.println(jk.append("Penz$").substring(2));

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        int ds = 3;
        String re = "ds";
        re+=false;
//        String ss = ds+ 4;
        LocalDate ld = LocalDate.of(2022, Month.JANUARY, 20);

        LocalDateTime ldt = LocalDateTime.now();
        ldt.plusMinutes(2);
//        ld.

        var lt = LocalTime.of(18,15);
        var lr = LocalTime.of(6,15);
        System.out.println(lt);
        System.out.println(lr);
    }

}
