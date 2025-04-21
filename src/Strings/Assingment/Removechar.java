package Strings.Assingment;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class Removechar {
    public static void main(String[] args) {
        Scanner m= new Scanner(System.in);

        String checl=input();
        System.out.println("Enter the chharacter that you wante to removwe from thw string");
        char ch=m.next().charAt(0);


        System.out.println(removechar(checl,ch));
    }
    public static String removechar(String s,  char c)
    {
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=c)
            {
                ans=ans+s.charAt(i);
            }
        }
        return ans;
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
