package com.stackroute.lib;

public class SubString {
    public String subString(String s, int n){
        String str=s;
        for(int i=0;i<n;i++)
        {
           str+= (s.substring(s.length()-n, s.length()));
        }
        return str;
    }
}
