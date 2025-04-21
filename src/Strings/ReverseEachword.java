package Strings;

import java.util.Scanner;

public class ReverseEachword {
    public static void main(String[] args)
    {
        String string = input();
//        String string1=;
        System.out.println(reverseeachandeverword(string));
    }
    public static String reverseeachandeverword(String s)
    {   String ans="";
        int currentword=0;
        int i;
        for( i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ')
            {
                int currentend=i-1;
                String reversedword="";
                for(int j=currentword ;j <=currentend ; j++)
                {
                    reversedword=s.charAt(i)+reversedword;
                }
                ans+=reversedword;

                currentword=i+1;


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
