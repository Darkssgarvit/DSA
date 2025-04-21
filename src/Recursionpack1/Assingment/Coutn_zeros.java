package Recursionpack1.Assingment;

import java.util.Scanner;

public class Coutn_zeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int res=countzero(n);
        System.out.println(res);
    }
    public static int countzero(int n)
    {
        if(n<10)
        {
            if(n==0)
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        if(n%10==0)
        {
            return 1+countzero(n/10);
        }
        else
        {
            return countzero(n/10);
        }
    }
}
