package com.stackroute.lib;

public class Palindrome {
    public String palindrome(int x){
        String s=Integer.toString(x);
        String temp="";
        for(int i=0;i<s.length();i++){
            temp+=s.charAt(s.length()-i-1);
        }
        System.out.println(temp);
        String res="";
        int sum=0;
        if(s.equals(temp))
        {
            System.out.println("Palindrome");
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)%2==0)
                {
                    sum+=s.charAt(i)-48;
                }
            }
            System.out.println(sum);
            if(sum>25)
            {
                res="Success";
            }
            else
            {
                res="failure";
            }

        }
        else
        {
            System.out.println("Not a Palindrome");
        }
       return res;
    }
}
