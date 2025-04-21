package searchingandsorting.Assingment;

import java.util.Scanner;

public class checkrotation {
    public static void main(String[] args) {
     int arr[]=takeinput();
     int h=checkrotation(arr);
        System.out.println(h);
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
    public static int checkrotation(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return (i+1);
            }
        }
        return Integer.MIN_VALUE;
    }
}
