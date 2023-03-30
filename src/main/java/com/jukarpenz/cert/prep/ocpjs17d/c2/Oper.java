package com.jukarpenz.cert.prep.ocpjs17d.c2;

public class Oper {

//1: public class CandyCounter {
//2:    static long addCandy(double fruit, float vegetables) {
//            3:       return (int)fruit+vegetables;
//            4:    }
//5:
//        6:    public static void main(String[] args) {
//            7:       System.out.print(addCandy(1.4, 2.4f) + ", ");
//            8:       System.out.print(addCandy(1.9, (float)4) + ", ");
//            9:       System.out.print(addCandy((long)(int)(short)2, (float)4)); } }
    public static void main(String ... args){
        int sample2 = 3 * 2 % 3;
        sample2 = 3;
//        sample2 += 1 + sample2++;
        sample2 = sample2++;
        sample2 = sample2++;
        sample2 = sample2++;
        sample2 = sample2++;
        long h = 3;

//        h -= 1.0;
        System.out.println("Sample: "+sample2);

        boolean sunny = true, raining = false, sunday = true;
        boolean goingToTheStore = sunny & raining ^ sunday;
        System.out.println(goingToTheStore);
        int pig = 4;
        pig = pig + pig++;
        System.out.println(pig);
        int a = 3;
        System.out.println(a+": " + Integer.toBinaryString(a));
        int l = Integer.toBinaryString(a).length();
        System.out.println("~"+a+": " + ~a);
        System.out.println("~"+a+": " + Integer.toBinaryString(~a));
        int sample1 = (2 * 4) % 3;
//         int sample2 = 3 * 2 % 3;
         int sample3 = 5 * (1 % 2);
         System.out.println("MODS: "+sample1 + ", " + sample2 + ", " + sample3);
        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
        ticketsSold += (long)1;
        System.out.println(ticketsSold);

        System.out.println(-a);
        System.out.println(-(-a));
        System.out.println((++a * a--)+a);

        char x=1,y=1;
        int xy = x+y;
        float eg = 1/8 + 1;
        short ss = 32767;
        short ns = ++ss;
        float rf=2;
        System.out.println(++ns);


//        String binaryString = "11111111111111111111111111111011";
//        //long num = Long3.parseLong(binaryString, 2);
//        int num = Integer.parseInt(binaryString, 2);
//        System.out.println("bn: "+num); // output: -5
//        long f = -5l;
//        int fi = -5;
//        System.out.println("5l("+Long.toBinaryString(f).length()+"): " + Long.toBinaryString(f));
//        System.out.println("5i("+Integer.toBinaryString(fi).length()+"): " + Integer.toBinaryString(fi));

//        System.out.println("~4: " + Integer.parseInt( "11111111111111111111111111111011",2));
//        System.out.println("~4: " + Integer.parseInt( Integer.toBinaryString(~a)));
    }

}
