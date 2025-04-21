package Conditionalandloops;

import java.util.Scanner;

public class sumofevendigitsandsumofodddigits {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int n= scanner.nextInt();
        int even=0, odd=0;
        while(n!=0)
        {
            int last=n%10;
            if(last%2==0)
            {
               even+=last;
            }
            else
            {
                odd+=last;
            }
            n=n/10;
        }
        System.out.println("Sumn of even is "+even);
        System.out.println("sum of odd is "+odd);
        ;
    }
}
