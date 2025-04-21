package Patterns;

import java.util.Scanner;

public class Interestingalphabets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=1;i<=n;i++)
        {   char ch=(char)('A'+n-i-1);
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}
