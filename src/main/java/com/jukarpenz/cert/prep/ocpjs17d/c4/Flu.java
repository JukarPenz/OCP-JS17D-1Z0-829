package com.jukarpenz.cert.prep.ocpjs17d.c4;

public class Flu {
    public static void main(String[] args) {

        String [] arrs = new String[5];
        String[]arre = {"","","","","",""};

        String[]lol[]={
                {"a","b"},
                {"d","e"}
        };

//        int [] tri [][] = new int [1][1][1];
        
        //String
        String hm = "Hola Mundo";
        String hn = " Hola Mundo".trim().intern();
        arrs[0]="Hola Mundo";
        arrs[1]=hm;
        arrs[2]=hm.trim();
        arrs[3]="Hola Mundo";
        arrs[4]="Hola Mundo";

//        hm = "Nuevo Mundo";
        System.out.println(hm==("Hola " + new String("Mundo").trim().intern()).intern());
// t
// t
// f
//



        System.out.println(hm.equals(hn));
        System.out.println(hm==hn);
        System.out.println(arrs[4]==hn);
        System.out.println(arrs[4]==arrs[0]);
        System.out.println(arrs[4]==arrs[1]);
        System.out.println(arrs[4]=="Hola Mundo");
        System.out.println(arrs[4]==arrs[2]);

        var pi = Math.PI;
        System.out.println(pi);
        System.out.println(String.format(">%f<",pi));
        System.out.println(String.format(">%18.3f<",1234567+pi));

        StringBuilder sb = new StringBuilder();
        sb.reverse();

        if(true) return;

        var nam = "John";
        int  or = 3;

        System.out.println(String.format("Ord %d belongs to: %S",or, nam));
        System.out.println("Ord %d belongs to: %s".formatted(or, nam));

        String b = """
                  a\tc
                b""";
        System.out.println(b+"<");
        System.out.println(b.translateEscapes()+"<");
        System.out.println(b.indent(3)+"<");
        System.out.println(b.stripIndent()+"<");



        String sl = "HOyEndIA";
        String sm = "HOyEndIA";
        System.out.println(sm==sl);
        sm = sm.toLowerCase();
        System.out.println(sm==sl);
        System.out.println(sm+"-"+sl);
        System.out.println(sm.contains("hoy"));
//        System.out.println(sm.ea);

        String na = "Jukar";
        String nas = new String("Jukar");
        String naz = new String("Jukar");
        String nan = "Jukar";

        System.out.println("==");
        System.out.println(nan.substring(0,5));
        System.out.println(na==nas);
        System.out.println(nan==nas);
        System.out.println(naz==nas);
        System.out.println(nan==na);
        System.out.println("equals");
        System.out.println(na.equals(nas));
        System.out.println(nan.equals(nas));
        System.out.println(naz.equals(nas));
        System.out.println(nan.equals(na));
        System.out.println("Change"+null);
        nas = nan;
        System.out.println(na==nas);
        System.out.println(nan==nas);
        System.out.println(nan==na);

        nan = "Penz";
        System.out.println("na: " + na);
        System.out.println("nas: " + nas);
        System.out.println("nan: " + nan);

        String ss= """
                Fluffy""";
        System.out.println(">"+ss+"<");

    }
}
