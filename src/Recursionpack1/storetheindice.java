package Recursionpack1;

import java.util.Scanner;

public class storetheindice {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int nums[]= new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=s.nextInt();
        }
        int target=s.nextInt();
        int a[]=checkduplicate(nums,target);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static int[] checkduplicate(int arr[],int target,int first)
    {
        if(first==arr.length)
        {
            int output[]=new int[0];
            return output;
        }
        int smalloutput[]=checkduplicate(arr,target,first+1);
        if(arr[first]==target)
        {
            int output[]=new int[smalloutput.length+1];
            output[0]=first;
            for(int i=0;i< smalloutput.length;i++)
            {
                output[i+1]=smalloutput[i];
            }
            return output;
        }
        else {
            return smalloutput;
        }
    }
    public static int[] checkduplicate(int arr[],int target)
    {
        return checkduplicate(arr,target,0);
    }

}
