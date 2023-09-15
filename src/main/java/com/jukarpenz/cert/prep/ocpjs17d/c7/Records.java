package com.jukarpenz.cert.prep.ocpjs17d.c7;

public class Records {

    public static void main(String[] args) {
//        Crane cr = new Crane(-3,"jc");
        Crane cr = new Crane(-5,"jc", "penz");
        System.out.println(cr.numberEggs());
        System.out.println(cr);
    }
}

record Crane(int numberEggs, String name){

//    public Crane(int numberEggs, String name){
//        this.name=name;
//        this.numberEggs=numberEggs;
//    }

    public Crane(String a, String b){
        this(-1, a+b);

    }

    Crane(int ne, String n, String l){
        this(ne*2, n+"-"+l);
        System.out.println("Going");
        n="Jukar";
//        this.numberEggs=3;
    }

    public Crane{
        name=name.toUpperCase();
//        numberEggs=-1*3;
    }

    public int getNumberEggs() {
        return numberEggs;
    }

    public String getName() {
        return name;
    }
}

sealed interface Cronos permits Crone {}

record Crone() implements Cronos {}

