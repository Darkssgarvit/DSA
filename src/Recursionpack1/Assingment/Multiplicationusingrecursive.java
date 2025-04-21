package Recursionpack1.Assingment;

import java.util.Scanner;

public class Multiplicationusingrecursive {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m= scanner.nextInt();int ans=mul(n,m);
        System.out.println(ans);
    }
    public static int mul(int n, int m)
    {
        if(m==0 || n==0)
        {
            return 0;
        }
        return n+mul(n,m-1);
    }

}
