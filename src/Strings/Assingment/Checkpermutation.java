package Strings.Assingment;

import java.util.Scanner;

public class Checkpermutation {
    public static void main(String[] args) {
    String string = input();
    String string2=input();
    boolean result=isPermutation(string,string2);
        System.out.println(result);
    }
    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
   public static boolean isPermutation(String string, String str2)
   {
       if(string.length()!=str2.length())
       {
           return false;
       }
       else
       {
           int frequency[]=new int[256];
           for(int i=0;i<256;i++)
           {
               frequency[i]=0;
           }
           for(int i=0;i<string.length();i++)
           {
               char ch=string.charAt(i);
               ++frequency[ch];
           }
           for(int i=0;i<str2.length();i++)
           {
               char ch=str2.charAt(i);
               --frequency[ch];
           }
           for(int i=0;i<256;i++)
           {
               if(frequency[i]!=0)
               {
                   return false;
               }
           }
       }
       return true;
   }
}
