package Recursionpack1;

import java.util.Scanner;

public class FIrstIndex {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i< nums.length ;i++)
        {
            nums[i]=s.nextInt();
        }
        int target=s.nextInt();
        int mains=chfirst(nums,target);
                System.out.print(mains);
    }
    private static int chfirst(int arr[], int first, int target)
    {
        if(first==arr.length)
        {
            return -1;
        }
        if(arr[first]==target)
        {
            return first;
        }
        return chfirst(arr,first+1,target);
    }
    public static int chfirst(int arr[],int target)
    {
        return chfirst(arr,0,target);
    }
}
