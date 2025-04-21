package Operatorsandforloop;

import java.util.Scanner;

public class Squareroot {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int i=1;
        while(i*i<=n)
        {
            i+=1;
        }
        System.out.println(i-1);
    }
}
