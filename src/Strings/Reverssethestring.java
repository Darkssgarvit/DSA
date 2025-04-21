package Strings;

import java.util.Scanner;

public class Reverssethestring {
    public static void main(String[] args) {
        String string = input();
        String newe=reverse(string);
        for(int i=0;i<=newe.length()-1;i++)
        {
            System.out.println(newe.charAt(i));
        }
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static String reverse(String str)
    {
        String reversedstring="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reversedstring+=str.charAt(i);
        }
        return reversedstring;
    }
}
