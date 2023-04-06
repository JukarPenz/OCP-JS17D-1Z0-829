package com.jukarpenz.cert.prep.ocpjs17d.c3;

import java.util.*;
import java.util.stream.Collectors;

public class Freq {

    public static int mostFrequent(int[] arr, int n)
    {

        Map<Integer,Integer> freq = new HashMap<Integer,Integer>();

        for (int a: arr) {
            int afreq = 0;
            if(freq.containsKey(a)){
                afreq=freq.get(a).intValue();
            }
            freq.put(a,afreq+1);
        }

        int maxFreq = 0;
        int freqNumb = 0;
        for (Map.Entry<Integer,Integer> mf:freq.entrySet()) {
            if(mf.getValue()>maxFreq){
                maxFreq = mf.getValue();
                freqNumb = mf.getKey();
            }
        }

        System.out.println("KEY: " + freqNumb+". FEQ: " + maxFreq);

        //return freq.get(maxFreq).

        //List<Integer> ls = Arrays.stream(arr).boxed().collect(Collectors.toList())
        Map<Integer,Long> rp = Arrays.stream(arr).boxed()//.collect(Collectors.toList())
                //.stream().collect(Collectors.groupingBy(l->l),Collectors.counting());
                .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
                //.entrySet().stream().
                ;
        //System.out.println(rp);
        //Map<Integer,Long> mp =
        System.out.println(
                Arrays.stream(arr).boxed()//.collect(Collectors.toList())
                //.stream().collect(Collectors.groupingBy(l->l),Collectors.counting());
                .collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
                //.values().stream().max(Long::compareTo).get()
                //.values().stream().max(Long::compareTo)
                .entrySet().stream().max(Map.Entry.comparingByValue())
                //        .orElseGet(Map.Entry<Integer,Long>=<0,0>)
                .map(Map.Entry::getValue)
                .map(Long::intValue)
                        .orElse(0)
        );
        return 0;// arr.stream().
    }

    // Driver program
    public static void main(String[] args)
    {

        int a = 0;
        if(--a>=0){
            System.out.println("MAS");;
        }
        else{
            System.out.println("MENOS");
        }
        a--;
        System.out.println(a);

        Stack<String> braces =  new Stack<String>();
        braces.push("a");
        braces.peek();
        braces.pop();

        for(var penguin : new Integer[2])
            System.out.println(">"+penguin+"<");

        int[] arr = { 40, 50, 30, 40, 50, 30, 30 };
        int n = arr.length;
        System.out.print(mostFrequent(arr, n));
    }
}
