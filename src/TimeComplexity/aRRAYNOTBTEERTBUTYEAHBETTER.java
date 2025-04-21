package TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;

public class aRRAYNOTBTEERTBUTYEAHBETTER {
    public static void main(String [] args)
    {
        int arr[]=takeinput();
        int arr2[]=takeinput();
        checkintersection(arr,arr2);
    }
    public static int []takeinput()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scanner.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
        }
        return arr;
    }
    public static void checkintersection(int arr[] , int arr2[])
    {
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(arr.length>i && arr2.length>j)
        {


            if (arr[i]==arr2[j])
            {
                System.out.println(arr[i]);
                i++;
                j++;

            }
            else if(arr[i]<arr2[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
    }
}

