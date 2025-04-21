package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
    String s = input();
    int res=countthewords(s);
        System.out.println(res);
    }public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static int countthewords(String str)
    {
        if(str.length()==0)
        {
            return 0;
        }
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                count++;
            }
        }
        return count+1;

    }
}
