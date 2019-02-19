package com.stackroute.lib;

import java.util.Scanner;

public class Guess {
    public String guess(int t, int n){
        boolean flag= false;
        String temp="";
        Scanner scan = new Scanner(System.in);
        while(flag)
        {
            if(n>t) {
                temp="Guessed umber is greater than target";

            }
            else if(n<t)
            {
                temp="Guessed umber is lesser than target";

            }
            else
            {
                temp="Guessed umber is matching the target target";
                flag=true;

            }
        }
        return temp;
    }
}