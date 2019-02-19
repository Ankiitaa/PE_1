package com.stackroute.lib;

public class TomAndJerry {
    public String tomAndJerry(int n){
        String temp="";
        if(n>20 && n<30)
        {
            if(n%2==0)
            {
               temp="Tom";
            }
            else
            {
              temp="Jerry";
            }
        }
        else
        {
           temp="Enetr valid input";
        }
        return temp;
    }
}
