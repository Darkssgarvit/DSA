package Strings;

import java.util.Scanner;

public class Printallsubstrings {
    public static void main(String[] args) {
        String string = input();
        printallthesubstring(string);
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static void printallthesubstring(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                System.out.println(s.substring(i,j+1));
            }
        }
    }

}
