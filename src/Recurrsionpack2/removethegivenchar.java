package Recurrsionpack2;

import java.util.Scanner;

public class removethegivenchar {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char ch=scanner.next().charAt(0);
        String main=removechar(s,ch);
        System.out.println(main);
    }
    public static String removechar(String string , char ch)
    {
        if(string.length()==0)
        {
            return "";
        }
        String smallans="";
        if(string.charAt(0)!=ch)
        {
            smallans+=string.charAt(0);
        }
        String abs=removechar(string.substring(1),ch);
        return smallans+abs;
    }
}
