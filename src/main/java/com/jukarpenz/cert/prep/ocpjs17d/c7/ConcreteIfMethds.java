package com.jukarpenz.cert.prep.ocpjs17d.c7;

public class ConcreteIfMethds{

    public static void main(String[] args) {
        SubSnake sn = new SubSnake();
        IsColdBlooded.eat();
        System.out.println(sn.getTemperature());
        SubSnakeDos sd = new SubSnakeDos();
        System.out.println(sd.getTemperature());
        SubSnakeTres st = new SubSnakeTres();
        System.out.println(st.getTemperature());
    }

}

interface IsColdBlooded {

    public abstract boolean hasScales();

    default double getTemperature(){
//        secretFood();
        return 10.0;
    }

    private static void secretFood(){
        System.out.println("Secret fooding");
    }

    static void eat(){
        System.out.println("Eating");
        secretFood();
    }
}

interface IsColdBloodedDos {

    public default double getTemperature(){
        return 20.0;
    }

}

class Snake implements IsColdBlooded{

    public boolean hasScales(){
        return true;
    }

//    public double getTemperature(){
//        return 12.0;
//    }

}

class SubSnake extends Snake implements IsColdBloodedDos{

    @Override
    public double getTemperature() {
        return super.getTemperature();
    }
}

class SubSnakeDos implements IsColdBlooded, IsColdBloodedDos{
    public boolean hasScales(){
        return false;
    }

    @Override
    public double getTemperature() {
        return 15.0;//IsColdBlooded.super.getTemperature();
    }

    static void dos(){

    }
}

class SubSnakeTres extends SubSnakeDos implements  IsColdBloodedDos, IsColdBlooded{
    void tres(){
        dos();
    }
}