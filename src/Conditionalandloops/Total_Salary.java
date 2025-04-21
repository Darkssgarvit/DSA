package Conditionalandloops;

import java.util.Scanner;

public class Total_Salary {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        float basicsalary=scanner.nextFloat();
        char grade=scanner.next().charAt(0);
        float hra=(float)(20.00/100)*basicsalary;
        float da=(float)(50.00/100)*basicsalary;
        float pf=(float)(11.00/100)*basicsalary;
        if(grade=='A' || grade =='a')
        {
            System.out.println(basicsalary+hra+da-pf+1700);
        }
        else if(grade=='B' || grade=='b')
        {
            System.out.println(basicsalary+hra+da+pf+1500);
        }
        else
        {
            System.out.println(basicsalary+hra+da+pf+1300);
        }

    }
}
