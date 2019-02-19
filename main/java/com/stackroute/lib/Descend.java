package com.stackroute.lib;

public class Descend {
    public String descend(int x){
        String n=Long.toString(x);
        char[] a= n.toCharArray();
        String temp="";

        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    char t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println(a);
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                sum+=(a[i]-48);
            }
        }
        System.out.println(sum);
        if(sum>15)
        {

            temp="success";
        }
        else
        {

            temp="failure";
        }
        return temp;
    }
}
