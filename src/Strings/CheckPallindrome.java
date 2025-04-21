package Strings;

import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        String s = input();
        int res=pallindrome(s);
        if(res==1)
        {
            System.out.println("Pallindrome");

        }
        else
        {
            System.out.println("Not a Pallindrome");
        }
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static int pallindrome(String s)
    {
        int start=0;
        int end=s.length()-1;
        while(start<=end)
        {
            if(s.charAt(start)!=s.charAt(end))
            {
                return 0;
            }
            start++;
            end--;

        }
        return 1;
    }
}
