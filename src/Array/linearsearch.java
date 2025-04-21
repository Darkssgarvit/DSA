package Array;


import java.util.Scanner;

public class linearsearch {
    public static void main(String[]a)
    {
        int arr[]=takeinput();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the value to be search");
        int x= scan.nextInt();
        int res=linearsearch(arr,x);
//        printarr(arr);
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
            System.out.println(ar[i]);
        }
    }
    public static int linearsearch(int arr[],int x)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }
}
