package org.example;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("Insert the numbert to get Fibonacci series:");
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();

        System.out.println("Fibonacci");
        int a =0;
        int   b=1;
        for(int i=1; i<=n; i++)
        {
            System.out.print(a + " ");
            int next= (a + b);
            a=b;
            b=next;
        }

    }
}
