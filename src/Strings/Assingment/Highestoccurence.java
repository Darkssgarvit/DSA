package Strings.Assingment;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Highestoccurence {
    public static void main(String[] args) {
        String string = input();
        char cg=highestoccurence(string);
        System.out.println(cg);

    }
    public static char highestoccurence(String str)
    {   int max=0;
        char answer='\0';
        if(str.length()==0)
        {
            return '0';
        }
        else
        {
            int frequency[]=new int[256];
            for(int i=0;i<256;i++)
            {
                frequency[i]=0;
            }
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                frequency[ch]++;
            }

            for(int i=0;i<256;i++)
            {
                if(max<frequency[i])
                {
                    max=frequency[i];
                    answer=(char)(i);
                }
            }
            return answer;



            }
        }



    public static String input()
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return s;
    }
}


