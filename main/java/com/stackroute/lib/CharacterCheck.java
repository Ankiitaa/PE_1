package com.stackroute.lib;

public class CharacterCheck {
    public String characterCheck(char c){
        String temp="";
        if(c>=65 && c <=90)
        {
           temp="Upper Case";
        }
        else if(c>=97 && c<=122)
        {
            temp="Lower Case";
        }
        else if(c>=48 && c<=57)
        {
            temp="Digit";
        }
        else
        {
            temp="Special";
        }
        return temp;
    }
}
