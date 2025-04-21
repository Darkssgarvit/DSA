package Operatorsandforloop;

import java.util.Scanner;

public class nthfibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int a=0;
        int b=1;
        int c=0;
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;

        }
        System.out.println(c);
    }
}
