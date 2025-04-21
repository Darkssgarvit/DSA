package searchingandsorting.Assingment;

import java.util.Scanner;

public class Second_largest {
    public static void main(String[] args) {
int arr[]=takeinput();
int second=secondlargest(arr);
        System.out.println(second);
    }
    public static int secondlargest(int arr[])
    {   int max=arr[0]; int secondmax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
            if(max>arr[i] && secondmax<arr[i])
            {
                return arr[i];
            }

        }
        return secondmax;
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
}
