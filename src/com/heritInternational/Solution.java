package com.heritInternational;
import java.io.*;
import java.util.*;

public class Solution {

    /**
     * Code description: Decide if character of the string is EVEN or ODD
     * ---------------------------------
     * Assignment from HackerRank Challenge:
     * https://www.hackerrank.com/challenges/30-review-loop/problem
     *
     *
     * Details:
     * ...The string "IvanDurisLikesJava" will be separated following as a result of the code
     * ...NOTE: the analysed String needs to be entered without spaces " " !
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of string you want to get separated into odd and even characters:");
        int T = sc.nextInt();

        String[] myString = new String[10]; //entered string by user
        char[] myCharArray;

        if (T>=1 & T<=10){
            for(int j=0;j<T;j++) {
                System.out.println("enter string");
                myString[j] = sc.next();
            }

            for(int j=0;j<T;j++) {
                if(myString[j].length()%2==0){
                    char[] evenChars=new char[myString[j].length()/2];
                    char[] oddChars= new char[myString[j].length()/2];
                    for(int i=0;i<myString[j].length();i++){
                        myCharArray = myString[j].toCharArray();
                        int k= (int) Math.floor(i/2); // zaokruhlovanie nahor

                        if(i%2==0) { //even chars
                            evenChars[k]=myCharArray[i];
                        }
                        else { //odd chars
                            oddChars[k]=myCharArray[i];
                        }

                    }
                    System.out.println(String.valueOf(evenChars) + " " + String.valueOf(oddChars));
                }
                else{
                    char[] evenChars=new char[myString[j].length()/2 + 1];
                    char[] oddChars= new char[myString[j].length()/2];
                    for(int i=0;i<myString[j].length();i++){
                        myCharArray = myString[j].toCharArray();
                        int k= (int) Math.floor(i/2); // zaokruhlovanie nahor

                        if(i%2==0) { //even chars
                            evenChars[k]=myCharArray[i];
                        }
                        else { //odd chars
                            oddChars[k]=myCharArray[i];
                        }
                    }
                    System.out.println(String.valueOf(evenChars) + " " + String.valueOf(oddChars));
                }
            }
            sc.close();
        }



    }
}