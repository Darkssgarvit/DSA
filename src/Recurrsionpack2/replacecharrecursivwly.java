package Recurrsionpack2;

import java.util.Scanner;

public class replacecharrecursivwly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char ch=scanner.next().charAt(0);
        char target=scanner.next().charAt(0);
        String main=replaced(s,ch,target);
        System.out.println(main);
    }
    public static String replaced(String string, char tobereplace, char byreplace)
    {
        if(string.isEmpty())
        {
            return string;
        }
        char c;
        if(string.charAt(0)==tobereplace)
        {
            c=byreplace;;
        }
        else
        {
            c=string.charAt(0);
        }
        String ans=replaced(string.substring(1),tobereplace,byreplace);
        return c+ans;
    }

}
