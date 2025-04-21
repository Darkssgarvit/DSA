package Conditionalandloops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println("the factors are : ");
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}
