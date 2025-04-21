package Operatorsandforloop;

import java.util.Scanner;

public class termsofaap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        int count=0;
        int term=0;

        while(count<=a)
        {
            int calc=3*term+2;
            if(calc%4!=0)
            {
                System.out.println(calc);
                count++;
            }
            term++;


        }
    }
}
