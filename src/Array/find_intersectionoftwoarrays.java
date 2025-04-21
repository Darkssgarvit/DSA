package Array;

import java.awt.print.PrinterGraphics;
import java.util.Scanner;

public class find_intersectionoftwoarrays {
    public static void main(String[] args) {
    int arr[]=takeinput();
    int arr2[]=takeinput();
    int res=findintersection(arr,arr2);
        System.out.println(res);
    }
    public static int[] takeinput()
    {
        System.out.println("Enter the Size of the array");
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int ar[]=new int[n];
        System.out.println("Enter the elemnts in the Array");
        for(int i=0;i<n;i++)
        {
            ar[i]= scanner.nextInt();
        }
        return ar;
    }
    public static void printarr(int ar[])
    {
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
    public static int findintersection(int arr[],int arr2[])
    {
        int i=0;
        int j=0;
        while(i<=j)
        {
            if(arr[i]>arr[j])
            {
                j++;
            }
            else if(arr[i]<arr[j])
            {
                i++;
            }
            else if(arr[i]==arr[j])
            {
                return arr[i];
            }
        }
        return Integer.MIN_VALUE;
    }
}
