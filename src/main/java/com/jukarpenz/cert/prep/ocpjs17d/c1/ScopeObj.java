package com.jukarpenz.cert.prep.ocpjs17d.c1;

import java.util.List;

public class ScopeObj {

    public static void main(String[] args) {
        String one, two;

        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;

        System.out.println("One[\"null\"]: " + one);
        System.out.println("Two[\"b\"]: " + two);
        System.out.println("Three[\"b\"]: " + three);
    }

    void runing(){
        System.out.println(ff);
    }
    float ff;




    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int cc = 0;

        int i=0,j=0,c=0;

        while(i<arr.size()){

            i++;
        }

//        for (int i = 0; i < arr.size(); i++) {
//            // System.out.print(arr.get(i)+"->");
//            //for (int j = 0; j < arr.size()  ; j++) {
//            for (int j = 0; j < arr.size() && i>j; j++) {
//                if(i==j){
//                    continue;
//                }
//                if(Math.abs(arr.get(i).intValue()-arr.get(j).intValue())==k){
//                    cc++;
//                }
//            }
//        }
        return cc;
    }
}
