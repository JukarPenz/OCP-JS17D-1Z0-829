package com.jukarpenz.cert.prep.ocpjs17d.c8;

import java.util.ArrayList;
import java.util.List;

public class aLambdas {

}


record Animal(String species, boolean canHop, boolean canSwim) { }

interface CheckTrait{
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait{
    public boolean test(Animal a){ return a.canHop();}
}

class TraditionalSearch{

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish",false,true));
        animals.add(new Animal("kangaroo",true,false));
        animals.add(new Animal("rabbit",true,false));
        animals.add(new Animal("turtle",false,true));

//        print(animals, new CheckIfHopper());
        print(animals, w -> !w.canHop());
    }

    private static void print(List<Animal> ans, CheckTrait checker){

        for(Animal a:ans){
            if(checker.test(a)){
                System.out.print(a.species() + ", ");
            }
            else{
//                System.out.print("*");
            }
        }

    }

}