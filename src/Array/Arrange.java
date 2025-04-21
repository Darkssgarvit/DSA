package Array;

import java.util.Scanner;

public class Arrange {
    public static void main(String[] args) {
//    int arr[]=takeinput();
//    int a[]=arrange(arr);
//    printarr(a);
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]=arrange(n);
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
    public static int[] arrange(int n) {
        int arr[]=new int[n];
        int start = arr[0];
        int i=1;
        int end = arr.length - 1;
        while (start <= end)
        {
            if(i%2==0)
            {
                arr[end]=i;
                end--;
            }
            else
            {
                arr[start]=i;
                start++;
            }
            i+=1;
        }
        return arr;
    }
}
