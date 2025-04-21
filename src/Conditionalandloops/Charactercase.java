package Conditionalandloops;

import java.util.Scanner;

public class Charactercase {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char ch=scanner.next().charAt(0);
        if(ch>='a' && ch<='z')
        {
            System.out.println("The Character is small");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("The Charatcer is Bigger");
        }
        else
        {
            System.out.println("Please enter the valid Alphabet to check");
        }
    }
}
