    package com.jukarpenz.cert.prep.ocpjs17d.c6;

    public class ChildClassTest {

        public static void main(String[] args) {
            String d = ChildClass.CLN;
    //        ChildClass.main(new String[] {""});
            System.out.println("New Object");
            new ChildClass();
            System.out.println("Invoking static method");
            ChildClass.testOut();
    //        System.out.println(d);
    //        new ChildClass();

        }
    }
