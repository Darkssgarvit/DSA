package Operatorsandforloop;

import java.util.Scanner;

public class pracdecimaltobinaryforease {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pow = 1;
        int sum = 0;
        while(n!=0)
        {
            int last=n%2;
            sum=sum+last*pow;
            pow*=10;
            n=n/2;
        }
        System.out.println(sum);
    }
}