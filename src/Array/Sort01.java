package Array;

import java.util.Scanner;

public class Sort01 {
    public static void main(String[] args) {
        int[]arr=takeinput();
        sort01(arr);
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
    public static void sort01(int arr[]) {
        int i = 0;
        int nonzero=0;
        while(i<=arr.length-1)
        {
            if(arr[i]==0)
            {
                int temp=arr[nonzero];
                arr[nonzero]=arr[i];
                arr[i]=temp;
                nonzero+=1;
            }
            i+=1;
        }
    }
}
