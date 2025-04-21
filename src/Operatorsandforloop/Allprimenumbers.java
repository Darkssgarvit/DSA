package Operatorsandforloop;

import java.util.Scanner;

public class Allprimenumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        for(int i=2;i<=n;i++)
        {   int check=checkprime(i);
            if(check==1)
            {
                System.out.println(i);
            }
        }
    }
    public static int checkprime(int n)
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return -1;
            }
        }
        return 1;
    }
}
