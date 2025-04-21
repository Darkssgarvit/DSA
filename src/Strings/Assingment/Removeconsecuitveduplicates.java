package Strings.Assingment;

import java.util.Scanner;

public class Removeconsecuitveduplicates {
    public static void main(String[] args) {
        String s=input();
        String res=remioveduplicates(s);
        System.out.println(res);
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
    public static String remioveduplicates(String s)
    {   String ans="";
        int n=s.length();
        if(n==0)
        {
            return null;
        }
        else
        {
            int startindex=0;
            while(startindex<n)
            {
                char uniquechar=s.charAt(startindex);
                int nextuniquecharacter=startindex+1;
                while(nextuniquecharacter<n && s.charAt(nextuniquecharacter)==uniquechar)
                {
                    nextuniquecharacter++;
                }
                ans+=uniquechar;
                startindex=nextuniquecharacter;
            }
        }
        return ans;
    }
}
