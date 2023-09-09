package com.jukarpenz.cert.prep.ocpjs17d.c7;

public class PrivMethdsInterface {

    public static void main(String[] args) {
            Schedule.workOut();
    }

}


abstract interface Schedule{

    public default void wakeUp(){ checkTime(5); }

//    private void

    private void haveBreakfast(){ checkTime(7); }

    static void workOut(){ checkTime(18); }

    private static void checkTime(int hr){
        System.out.println(hr>17?"You're late!, by "+(hr-17)+" hrs.":"You have " + (17-hr)+" hours left to make the appointment.");
    }

    private void confirmTime(int hr){

    }
}

interface ZooTrainTour{

    abstract
    int getTrainName();

    private static void ride(){}

    default void playHorn(){
        getTrainName();
        ride();
    }

    public static void slowDown(){
//        playHorn();
    }

    static void speedUp(){
        ride();
    }

}