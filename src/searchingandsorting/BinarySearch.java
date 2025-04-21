package searchingandsorting;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner m= new Scanner(System.in);
        int index=m.nextInt();int arr[]=takeinput();
        int result=binarysearch(arr,index);
        System.out.println(result);
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
    public static int binarysearch(int arr[],int index)
    {
        int left=0;
        int right=arr.length-1;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(mid>index)
            {
                right=mid-1;
            } else if (mid<index)
            {
                left=mid+1;
            }
            else
            {
                return mid;
            }
        }
        return Integer.MIN_VALUE;
    }
}
