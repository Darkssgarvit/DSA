package Patterns;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=-scanner.nextInt();
        char ch='A';
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(ch+i));
            }
            System.out.println();
        }


    }

}
