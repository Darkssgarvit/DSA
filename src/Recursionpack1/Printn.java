package Recursionpack1;

import java.util.Scanner;

public class Printn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
   printn(n);
    }
    public static void printn(int n)
    {
        if(n==0)
        {
            return;
        }
        printn(n-1);
        System.out.println(n);

    }
}
