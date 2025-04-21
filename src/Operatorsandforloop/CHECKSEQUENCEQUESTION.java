package Operatorsandforloop;

import java.util.Scanner;

public class CHECKSEQUENCEQUESTION {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int prev= scanner.nextInt();
        int count=2,current;
        boolean isdec=true;
        while(count<=n)
        {
            current=scanner.nextInt();
            count++;
            if(current==prev)
            {
                System.out.println("False");
                return;
            }
            if(current<prev)
            {
                if(isdec==false)
                {
                    System.out.println("false");return;
                }
            }
            else
            {
                if(isdec==true)
                {
                    isdec=false;
                }
            }
            prev=current;
        }
        System.out.println("true1");

    }
}
