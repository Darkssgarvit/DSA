package Operatorsandforloop;

import java.util.Scanner;

public class Decimaltobinary {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        int pow=1;
        while(n!=0)
        {
            int last=n%2;
            sum=sum+pow*last;
            n=n/2;
            pow*=10;
        }
        System.out.println(sum);
    }
}
