package org.example;

import java.util.Scanner;

public class Sum
{
    public static void main(String[] args) {
        int sum;
        System.out.println("Number 1:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("Number 2:");
        int y=sc.nextInt();
        sum=x+y;
        System.out.println("Total sum is: "+ sum);
    }
}
