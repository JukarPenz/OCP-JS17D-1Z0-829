package com.jukarpenz.cert.prep.ocpjs17d.c1;

/**
 * To illustrate initializers order
 */
public class Bird {

    {
        System.out.println("1. static initializer one: " + ++t);
//        System.out.println("S: " + s)/;
    }

    public Bird(){
        System.out.println("3. Bird constructor: " + ++t);
    }

    static int t = 1;
    String s = "hi";

    double dd =566.25646464684855;
    int mi =1000000000;
    int mi_ =10_00_000_000;
    char cc;


    public static void main(String[] args) {

        Bird bb= new Bird();
        System.out.println(lowClass.low);
        System.out.println("Dd: " + bb.dd);
        System.out.println("Char: " + bb.cc);
        System.out.println("Mi: " + bb.mi);
        System.out.println("Mi_: " + bb.mi_);
        System.out.println("4. This is main starting");
        System.out.println("And t here is: " + t);
        new lowClass();
        System.out.println(bolVar);
        //System.out.println("TB: " + lowClass.tb);
    }

    {
        System.out.println(bolVar);
    }
    static boolean bolVar;

    {
        System.out.println("2. static initializer two: " + ++t);
        System.out.println("S: " + s);
    }
}

class lowClass{

    String tb = """
            This is"  
            a freaking what he said:\n"Ok this is new"\
               text/\s/block
               \\"\""":\""".\
               """;


    public lowClass(){
        System.out.println(tb);
    }

    String reference = "reference";
    int r = reference.length();
//    int b = r.len
    static String low = "This is a string located at lowClass";
}
