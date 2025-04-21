package Array;

import java.util.Scanner;

public class findduplicateapproach2 {
    public static void main(String[] args) {
        int arr[]=takeinput();
        int dup=findduplicateapproach2(arr);
        System.out.println(dup);
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
    public static int findduplicateapproach2(int[]arr)
    {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int naturalsum=((n-1)*(n-2))/2;
        return sum-naturalsum;
    }
}
