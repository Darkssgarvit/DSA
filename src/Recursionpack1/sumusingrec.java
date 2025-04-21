package Recursionpack1;

import java.util.Scanner;

public class sumusingrec {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n =scanner.nextInt();
    int ews=sumus(n);
        System.out.println(ews);
    }
    public static int sumus(int n)
    {
        if(n==1)
        {
            return 1;
        }
        return n+sumus(n-1);

    }


}
