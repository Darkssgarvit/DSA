package Patterns;

import java.util.Scanner;

public class Characterpattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {   char d=(char)(ch+i-1);
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(d+j-1));
            }
            System.out.println();
        }
    }
}
