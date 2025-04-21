package Array;

import java.util.Scanner;

public class SwapAlterate {
    public static void main(String[] args)
    {
         int arr[]=takeinput();
         swapalternate(arr);
         printarr(arr);
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
    public static void swapalternate(int arr[])
    {
        for(int i=0;i<arr.length;i+=2)
        {
            int a=arr[i+1];
            arr[i+1]=arr[i];
            arr[i]=a;
        }
    }
}
