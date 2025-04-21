package Operatorsandforloop;

import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the binary number");
        int n= scanner.nextInt();
        int pow=1;
        int sum=0;
        while(n!=0)
        {
            int last=n%10;
            sum=last*pow+sum;
            pow*=2;
            n=n/10;
        }
        System.out.println(sum);
    }
}
