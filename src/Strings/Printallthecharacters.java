package Strings;

import java.util.Scanner;

public class Printallthecharacters {
    public static void main(String[] args)
    {
        String string=input();
        printallchar(string);
    }
    public static void printallchar(String s)
    {
        for(int i=0;i<=s.length()-1;i++)
        {
            System.out.println(s.charAt(i));
        }
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}
