package org.example;
import java.util.Scanner;

/* Ernesto Gonzalez
Find the largest number from three.
* */
public class LargestOfThree
{
    public static void main(String[] args)
    {
        System.out.println("Insert First Number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println("Insert Second Number");
        Scanner input2 = new Scanner(System.in);
        int number2 = input2.nextInt();
        System.out.println("Insert Third Number");
        Scanner input3 = new Scanner(System.in);
        int number3 = input3.nextInt();
        if (number>number2 && number2>number3)
        {
            System.out.println("The largest number is: "+ number);
        }
        else if(number2>number3 && number2>number)
        {
            System.out.println("The largest number is: "+ number2);
        }
        else
        {
            System.out.println("The largest number is: "+ number3);
        }


    }
}
