package Recursionpack1;

import java.util.Scanner;

public class Coutthenumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base");
        int base= scanner.nextInt();
        System.out.println("Enter the Power");
        int anss=countt(base);
        System.out.println(anss);
    }
    public static int countt(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int ans=countt(n/10);
        return ans+1;
    }
}
