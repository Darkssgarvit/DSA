package Array;

import java.util.Scanner;

public class Pair_sum {
    public static void main(String[] args) {
        int arr[]=takeinput();
        int res=returnnumberofpair(arr,7);
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
    public static int returnnumberofpair(int arr[], int sum)
    {   int count=0;
        int i=0;

        while(i<=arr.length-2)
        {   int j=i+1;
            while(j<arr.length)
            {
                if(arr[i]+arr[j]==sum)
                {
                    count++;
                }
                j+=1;
            }
            i+=1;

        }
        return count;
    }
}
