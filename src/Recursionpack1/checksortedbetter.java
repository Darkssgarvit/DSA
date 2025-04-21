package Recursionpack1;

import java.util.Scanner;

public class checksortedbetter {
    public static void main(String[] args)
    {
        Scanner scanner =  new Scanner(System.in);
        int n=scanner.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]= scanner.nextInt();
        }
        boolean ans=abetterapproach(arr);
        System.out.println(ans);
    }
    public static boolean abetterapproach(int arr[] , int startindex)
    {
        if(startindex>=arr.length-1)
        {
            return true;
        }
        if(arr[startindex]>arr[startindex+1])
        {
            return false;
        }
        boolean ans=abetterapproach(arr,startindex+1);
        return ans;
    }
    public static boolean abetterapproach(int arr[] )
    {
        return abetterapproach(arr,0);
    }

}
