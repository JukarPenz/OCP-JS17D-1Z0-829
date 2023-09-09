package com.jukarpenz.cert.prep.ocpjs17d.c7;

public class AbstractMethdsIfc {

    public static void main(String[] args) {
        Worker w = new Worker();
        w.printStatus();
    }

}

interface ZooRenovation{
    String projectName();

    String status();

    default void printStatus(){
        System.out.println("The " + this.projectName() + " status " + this.status());
    }
}

class Worker implements ZooRenovation{

    public String projectName(){
        return "Bioparque";
    }

    public String status(){
        return "working";
    }
}