package com.jukarpenz.cert.prep.ocpjs17d.c3;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result3 {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here
        String balanced = "YES";

        int charPos = 0,bc=0, cc=0, dc=0;
        Stack<String> braces =  new Stack<String>();

        for(char c:s.toCharArray()){
            boolean openBrace = false;
            boolean closeBrace = false;
            switch(c){
                case '('-> {
                    braces.push("(");
                    openBrace = true;
                    bc++;
                }
                case '{'-> {
                    braces.push("{");
                    openBrace = true;
                    cc++;
                }
                case '['-> {
                    braces.push("[");
                    openBrace = true;
                    dc++;
                }
                case ']'-> {
                    if(!braces.isEmpty() && braces.peek().equals("[")){
                        dc--;
                        braces.pop();
                    }
                    else{
                        balanced="NO";
                        break;
                    }
                }
                case '}'-> {
                    if(!braces.isEmpty() && braces.peek().equals("{")){
                        dc--;
                        braces.pop();
                    }
                    else{
                        balanced="NO";
                        break;
                    }
                }
                case ')'-> {
                    if(!braces.isEmpty() && braces.peek().equals("(")){
                        dc--;
                        braces.pop();
                    }
                    else{
                        balanced="NO";
                        break;
                    }
                }
            }
        }

        //System.out.println("{ counter: " +bc);
        //balanced = bc==0?"YES":balanced;
        System.out.println(balanced);

        return balanced;

    }

}

public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result3.isBalanced(s);

                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
