package Operatorsandforloop;

import java.util.Scanner;

public class sumorproduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int c= scanner.nextInt();
        if(c==1)
            System.out.println(sum(n));
        else if (c==2)
        {
            System.out.println(mul(n));
        }
        else
        {
            System.out.println(-1);
        }
    }
    public static int sum(int n)

    {   int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    public static int mul(int n) {
        int mul = 1;
        for (int i = 1; i <= n; i++)
        {
            mul*=i;
        }
        return mul;
    }
}
