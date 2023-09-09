package com.jukarpenz.cert.prep.ocpjs17d.c7;

public class SealingClasses {

    public static void main(String[] args) {
        LoboMx ml = new LoboMx();
        ml.come();
    }

}

abstract sealed class Wolf permits Timber, MyLobo{
    public void come(){
        System.out.println("Mi Wolf Comiendo");
    }
}

final class Timber extends Wolf{}

non-sealed class MyLobo extends Wolf{

}

sealed class Lobo extends MyLobo permits LoboMx{}

final class LoboMx extends Lobo{

}

abstract sealed interface Animal{}

sealed interface Bear extends Animal {}

final class BlackBear implements Bear{}