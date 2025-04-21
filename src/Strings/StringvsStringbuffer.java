package Strings;

import java.util.Scanner;

public class StringvsStringbuffer {
    public static void main(String[] args) {
    StringBuffer string = new StringBuffer("abc");
    string.setCharAt(0,'j');
        System.out.println(string
        );
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }

}
