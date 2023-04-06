package com.jukarpenz.cert.prep.ocpjs17d.c3;

public class Decision {

    void testPattern(Number n){
        if((n instanceof Integer d)){
            System.out.println("no"+ d.intValue());
            return;
        }

        int yield = 3;

        int f = 3;
        boolean r = switch (f){
            case 1,3,2,4 -> true;
            case 44-> false;
            default-> {yield false;}
        };

        switch(f){
            case 1,2,4 -> System.out.println("no");
        }
        //d.intValue();
    }


    int getC(){
        return(int) (Math.random() * 10);
    }

    void feedA(){
        final int c=getC();
    }

    public static void main(String[] args) {
        int f = 4;
        boolean r = switch (f){
            case 1,3,2,4 -> true;
            case 44-> false;
            default-> {yield false;}
        };



        byte by = 0;
        String ss = switch (by){
            case 1->{yield "";}
            default -> "";
            case 4 -> {yield "f";}
        };


        final String fin = "";

        switch("string"){
            case "a":break;
            default:break;
            case fin:
                System.out.println("allowed");
                break;
        }

        switch(f){
            case 1,2,4 -> System.out.println("no");
            case 5 -> System.out.println("no");
            case 6 -> System.out.println("no");
        }

        float o =3.5f;
        long u = 3;
        boolean sd = o<u;

        int i = 0;
        for (; i < 2; i++) {

        }

        int[] as = new int[3];
        for (var s : as) {
            System.out.println(s);
        }
    }
}
