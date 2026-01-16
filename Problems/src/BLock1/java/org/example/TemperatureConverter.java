package org.example;
import java.util.Scanner;

public class TemperatureConverter
{
    public static void main(String[] args)
    {
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        Scanner sc=new Scanner(System.in);
        int op=sc.nextInt();
        if (op==1)
        {
            System.out.println("Enter temperature in Celsius");
            double temp=sc.nextInt();
            double Fahrenheit =temp*9/5+32;
            System.out.println("Celsius to Fahrenheit: " + Fahrenheit );
        }
        else if (op == 2)
        {
            System.out.println(" Enter temperature in Fahrenheit");
            double temp=sc.nextInt();
            double Celsius=(temp-32)/1.8;
            System.out.printf("Celsius to Fahrenheit: " + Celsius);
        }
        else {
            System.out.println("Invalid input");
        }


    }
}
