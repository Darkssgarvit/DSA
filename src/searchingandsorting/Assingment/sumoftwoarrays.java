package searchingandsorting.Assingment;

import java.util.Scanner;

public class sumoftwoarrays {
    public static void main(String[] args) {
            int arr1[]=takeinput();
            int arr2[]=takeinput();
            int ouput[]=new int[arr1.length+ arr2.length];
            sumoftwoarray(arr1,arr2,ouput);
            printarr(ouput);
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
    public static void sumoftwoarray(int arr1[],int arr2[],int output[])
    {
        int i= arr1.length-1;
        int j= arr2.length-1;
        int carry=0;
        int k=Math.max(arr1.length,arr2.length);
        while(i>=0 && j>=0)
        {
            int sum=arr1[i]+arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;

            i-=1;
            j-=1;
            k-=1;
        }
        while(i>=0)
        {
            int sum=arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i-=1;k-=1;
        }

        while(j>=0)
        {
            int sum=arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            j-=1;k-=1;
        }
        output[0]=carry;
  }
}
