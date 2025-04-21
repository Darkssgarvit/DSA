package Recursionpack1;

import java.util.Scanner;

public class LastIndex {
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=scanner.nextInt();
        }
        int target=scanner.nextInt();
        int check=lastIndex(nums,target);
        System.out.println(check);
    }
    private static int lastIndex(int nums[],int first,int target)
    {
        if(first==nums.length)
        {
            return -1;
        }
        int smallans= lastIndex(nums,first+1,target);
        if(smallans!=-1)
        {
            return smallans;
        }
        if(nums[first]==target)
        {
            return first;
        }
        else
        {return -1;}
    }
    public static int lastIndex(int nums[],int target)
    {
        return lastIndex(nums,0,target);
    }
}
