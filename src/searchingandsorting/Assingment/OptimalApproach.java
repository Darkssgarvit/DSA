package searchingandsorting.Assingment;

import java.util.Scanner;

public class OptimalApproach {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        int arr[]=takeinput();
        System.out.println("The number of rotations");
        int d=m.nextInt();
        rotate(arr,d);
        printarr(arr);

    }

    public static void swap(int arr[],int start,int end)
    {
        int temmp=arr[start];
        arr[start]=arr[end];
        arr[end]=temmp;
    }
    public static void revrse(int arr[], int start, int end)
    {
        while(start<end)
        {
            swap(arr, start, end);
            start+=1;
            end-=1;
        }
    }
    public static void rotate(int arr[], int d)
    {
        if(arr.length==0)
        {
            return ;
        }
        else if (d>=arr.length && arr.length!=0)
        {
            d%=arr.length;
        }
        revrse(arr,0,arr.length-1);
        revrse(arr,0,arr.length-1-d);
        revrse(arr,arr.length-d,arr.length-1);

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
