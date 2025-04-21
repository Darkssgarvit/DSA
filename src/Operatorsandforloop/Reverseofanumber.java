package Operatorsandforloop;

import java.util.Scanner;

public class Reverseofanumber {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        while(n!=0)
        {
            int last=n%10;
            sum=sum*10+last;
            n/=10;
        }
        System.out.println(sum);
    }
}
