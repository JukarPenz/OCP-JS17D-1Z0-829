package com.jukarpenz.cert.prep.ocpjs17d.c7;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Polymorphism {

}

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    abstract boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {

    public boolean isTailStriped() {
        return false;
    }

    public int age = 14;

    public static void main(String[] args) {

        Lemur l = new Lemur();
        l.doLemur(l);
        l.doHasTail(l);

    }

    void doLemur(Lemur l) {
        System.out.println("Lemur: " + l.age);
        System.out.println("Lemur: " + l.isTailStriped());
        System.out.println("Lemur: " + l.hasHair());
    }

    void doPrimate(Lemur l) {
        Primate co = l;
//        System.out.println("Lemur: " + co.age);
//        System.out.println("Lemur: " + co.isTailStriped());
        System.out.println("Lemur: " + co.hasHair());

    }

    void doHasTail(Lemur l) {
        HasTail co = l;

        System.out.println("Lemur: " + ((Lemur) co).age);
        System.out.println("Lemur: " + co.isTailStriped());
        System.out.println("Lemur: " + ((Lemur) co).hasHair());
    }

//    BiFunction<Lemur, String, String> doLemur() = ;


}

interface Canine {
}

interface Dog {
}
class Doggy extends Wolfo{}
class Wolfo implements Canine {

    public static void main(String[] args) {
        Wolfo w = new Wolfo();
        Canine dogW = (Canine) w;
    }
}

class Rodent{

    void doRo(){
        System.out.println("doRo");
    }

}
class Capybara extends Rodent{

    void doCa(){
        System.out.println("doCa");
    }

    public static void main(String[] args) {
//        Capybara cr = new Rodent();
        Rodent r = new Capybara();
        r.doRo();
//        var c = (Capybara) r;
        Capybara c = null;
        if(r instanceof Capybara){
            c=(Capybara) r;
            System.out.println("Setting Capybara");
        }
        else{
            System.out.println("Not an instance of Capybara");
        }
    }
}