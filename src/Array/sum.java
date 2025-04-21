package Array;

import java.util.Scanner;

public class sum {
    public static void main(String[]args)
    {
        int arr[]=takeinput();
        printarr(arr);
        int red=sum(arr);
        System.out.println(red);
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
            System.out.println(ar[i]);
        }
    }
    public static int sum(int ar[])
    {
        int sum=0;
        for(int i=0;i<ar.length;i++)
        {
            sum+=ar[i];
        }
        return sum;
    }
}