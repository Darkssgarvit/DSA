package Conditionalandloops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= scanner.nextInt();
        System.out.println("Enter the power");
        int x= scanner.nextInt();
        int pow=n;
        for(int i=1;i<x;i++)
        {
            pow=pow*n;
        }
        System.out.println(pow);
    }
}
