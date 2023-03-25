package com.jukarpenz.cert.prep.ocpjs17d.c1;

public class ScopeObj {

    public static void main(String[] args) {
        String one, two;

        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;

        System.out.println("One[\"null\"]: " + one);
        System.out.println("Two[\"b\"]: " + two);
        System.out.println("Three[\"b\"]: " + three);
    }

}
