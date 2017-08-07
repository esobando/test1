package com.example.admin.test;

import android.provider.Settings;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Admin on 8/7/2017.
 */

public class CodingTest
{
    public static void main(String[]args)
    {
        Scanner ARM = new Scanner(System.in);

        int c=0,a,temp;
        System.out.println("Type in your number: ");
        int n = ARM.nextInt();
        temp=n;
        while(n>0)
        {
            a=n%10;
            n=n/10;
            c=c+(a*a*a);
        }
        if(temp==c)
            System.out.println("It's a armstrong number");
        else
            System.out.println("It's Not an armstrong number");
        Stack();
    }

    public static void Stack()
    {
        ArrayList<String> List = new <String>ArrayList();
        List.add("Camery");
        List.add("Supra");
        List.add("Hummer");
        List.add("Corvette");
        System.out.println(List.toString());

    }
}
