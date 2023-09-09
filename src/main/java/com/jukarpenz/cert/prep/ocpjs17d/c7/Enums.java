package com.jukarpenz.cert.prep.ocpjs17d.c7;

import java.util.Arrays;

public class Enums {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(Season.values()));
//        System.out.println(Arrays.toString(Season.values()));
//        System.out.println(Season.spring);
//        System.out.println(Season.spring.toString());
//        System.out.println(Season.spring.name());
//        System.out.println(Season.spring.name());
//        System.out.println(Season.spring.ordinal());

//        System.out.println("=+=+=+=+=+=+=+=+=+=+=");

        for(Season s:Season.values())
            System.out.println(s.name() + " -> " + s.ordinal() + " -> " + s.getExpectedVisitors() + " :"+ s.getEstimatedNumber() +  " . " + Season.valueOf(s.name()));

        System.out.println("=+=+=+=+=+=+=+=+=+=+=");

        for(Floor f:Floor.values())
            System.out.println(f.name() + " -> " + f.ordinal() + " -> " + f.getValue() + ". " + Floor.valueOf(f.name()));
    }

}


enum Season{
    WINTER("Low"){
        public String getExpectedVisitors(){
            return "Overriden expected Visitors: UNDETERMINED";
        }
        public int getEstimatedNumber(){
            return 15;
        }
    },
    SPRING("Medium"){
        public int getEstimatedNumber(){
            return 45;
        }

    },
    SUMMER("High"){
        public int getEstimatedNumber(){
            return 95;
        }
    },
    FALL("Medium"){
        public int getEstimatedNumber(){
            return 55;
        }
    };

    private final String expectedVisitors;

    private Season(String v){
        System.out.println("setting " + v);
        this.expectedVisitors=v;
    }

    public String getExpectedVisitors(){
        return this.expectedVisitors;
    }


    abstract int getEstimatedNumber();
}

enum Floor{
    FIRST(1), SECOND(2), Third(3);

    Integer f;

    Floor(int f){
        System.out.println("Setting floor... " + f);
        this.f=f;
    }

    public int getValue(){
        return f;
    }
}