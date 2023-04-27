package com.jukarpenz.cert.prep.ocpjs17d.c4;

import java.util.Arrays;

public class Arr {

    public static void main(String[] args) {
        comp();
    }

    static void comp(){
        int il=0;
        float fl = il;
        double w = Math.pow(il,2);
        double idl = 3;
        long id = Math.round(idl);
        double idd = Math.ceil(il);
        System.out.println(id);
        long li = -2;
        int fd = (int) Math.min(il,li);
        System.out.println(fd);

        int [] a = new int[] {1,-1,3};
        int [] b = new int[] {1,-1,4,0,0,0};

        if(Arrays.compare(a,b)!=0){
            int mis = Arrays.mismatch(a,b);
            System.out.println(a[mis] + " != " + b[mis]);
        }

        //System.out.println(Arrays.compare(a,b));

    }

}
